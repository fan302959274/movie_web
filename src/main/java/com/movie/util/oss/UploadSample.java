package com.movie.util.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectRequest;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 断点续传上传用法示例
 *
 */
public class UploadSample {

    private static String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "LTAIOymMDH5DQyY2";
    private static String accessKeySecret = "ER7SfUVjivxI6Tn3M5YQQAH6a02LBm";

    private static String bucketName = "foxmovie";
    private static String key = "179242a666b5770f30b3462e2de96945.mp4";
//    private static String uploadFile = "C:\\Users\\sh00859\\Desktop\\bak\\back.jpg";
    private static String uploadFile = "C:\\\\Users\\\\sh00859\\\\Desktop\\\\179242a666b5770f30b3462e2de96945.mp4";





    public static void main(String[] args) throws IOException {

        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            // 带进度条的上传
            ossClient.putObject(new PutObjectRequest(bucketName, key, new FileInputStream(uploadFile)).
                    <PutObjectRequest>withProgressListener(new PutObjectProgressListener()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ossClient.shutdown();

//        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
//
//        try {
//            UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, key);
//            // 待上传的本地文件
//            uploadFileRequest.setUploadFile(uploadFile);
//            // 设置并发下载数，默认1
//            uploadFileRequest.setTaskNum(5);
//            // 设置分片大小，默认100KB
//            uploadFileRequest.setPartSize(2048 * 2048 * 1);
//            // 开启断点续传，默认关闭
//            uploadFileRequest.setEnableCheckpoint(true);
//
//            UploadFileResult uploadResult = ossClient.uploadFile(uploadFileRequest);
//
//            CompleteMultipartUploadResult multipartUploadResult =
//                    uploadResult.getMultipartUploadResult();
//            System.out.println(multipartUploadResult.getETag());
//
//        } catch (OSSException oe) {
//            System.out.println("Caught an OSSException, which means your request made it to OSS, "
//                    + "but was rejected with an error response for some reason.");
//            System.out.println("Error Message: " + oe.getErrorCode());
//            System.out.println("Error Code:       " + oe.getErrorCode());
//            System.out.println("Request ID:      " + oe.getRequestId());
//            System.out.println("Host ID:           " + oe.getHostId());
//        } catch (ClientException ce) {
//            System.out.println("Caught an ClientException, which means the client encountered "
//                    + "a serious internal problem while trying to communicate with OSS, "
//                    + "such as not being able to access the network.");
//            System.out.println("Error Message: " + ce.getMessage());
//        } catch (Throwable e) {
//            e.printStackTrace();
//        } finally {
//            ossClient.shutdown();
//        }
    }
}
