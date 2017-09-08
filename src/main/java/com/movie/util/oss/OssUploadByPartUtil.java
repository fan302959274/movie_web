package com.movie.util.oss;

import com.aliyun.oss.OSSClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 断点续传上传文件工具类
 */
public class OssUploadByPartUtil {


    protected static OSSClient client = null;

    private static Logger logger = LoggerFactory.getLogger(OssUploadByPartUtil.class);

    public static String fileUpload(MultipartFile file, String endpoint, String accessKeyId, String accessKeySecret, String bucketName) {
        logger.info("开始时间" + new Date());
        // 创建一个可重用固定线程数的线程池。若同一时间线程数大于10，则多余线程会放入队列中依次执行
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        String key = file.getOriginalFilename(); // 获取上传文件的名称，作为在OSS上的文件名
        // 创建OSSClient实例
        client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            String uploadId = OssAliyunUpload.claimUploadId(bucketName, key);
            // 设置每块为 5M(除最后一个分块以外，其他的分块大小都要大于5MB)
            final long partSize = 1 * 1024 * 1024L;
            // 计算分块数目
            long fileLength = file.getSize();
            int partCount = (int) (fileLength / partSize);
            if (fileLength % partSize != 0) {
                partCount++;
            }

            // 分块 号码的范围是1~10000。如果超出这个范围，OSS将返回InvalidArgument的错误码。
            if (partCount > 10000) {
                throw new RuntimeException("文件过大(分块大小不能超过10000)");
            } else {
                logger.info("一共分了 " + partCount + " 块");
            }

            /**
             * 将分好的文件块加入到list集合中
             */
            for (int i = 0; i < partCount; i++) {
                long startPos = i * partSize;
                long curPartSize = (i + 1 == partCount) ? (fileLength - startPos) : partSize;

                // 线程执行。将分好的文件块加入到list集合中
                executorService.execute(new OssAliyunUpload(file, startPos, curPartSize, i + 1, uploadId, key, bucketName));
            }

            /**
             * 等待所有分片完毕
             */
            // 关闭线程池（线程池不马上关闭），执行以前提交的任务，但不接受新任务。
            executorService.shutdown();
            // 如果关闭后所有任务都已完成，则返回 true。
            while (!executorService.isTerminated()) {
                try {
                    // 用于等待子线程结束，再继续执行下面的代码
                    executorService.awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            /**
             * partETags(上传块的ETag与块编号（PartNumber）的组合) 如果校验与之前计算的分块大小不同，则抛出异常
             */
            System.out.println(OssAliyunUpload.partETags.size() + " -----   " + partCount);
            if (OssAliyunUpload.partETags.size() != partCount) {
                throw new IllegalStateException("OSS分块大小与文件所计算的分块大小不一致");
            } else {
                logger.info("将要上传的文件名  " + key + "\n");
            }

            /*
             * 列出文件所有的分块清单并打印到日志中，该方法仅仅作为输出使用
             */
            OssAliyunUpload.listAllParts(uploadId);

            /*
             * 完成分块上传
             */
            OssAliyunUpload.completeMultipartUpload(uploadId);

            // 返回上传文件的URL地址
            logger.info(endpoint + "/" + bucketName + "/" + key);

            
            
            return "http://"+bucketName+"."+endpoint.substring(endpoint.indexOf("//")+2)+"/"+ key;

        } catch (Exception e) {
            logger.error("上传失败！", e);
            return "上传失败！";
        } finally {
            OssAliyunUpload.partETags.clear();
            if (client != null) {
                logger.info("结束时间" + new Date());
                client.shutdown();
            }
        }
    }
    
}
