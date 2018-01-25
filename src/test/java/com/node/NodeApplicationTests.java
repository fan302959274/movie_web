package com.node;

import com.aliyun.vod.upload.impl.UploadVideoImpl;
import com.aliyun.vod.upload.req.UploadURLStreamRequest;
import com.aliyun.vod.upload.req.UploadVideoRequest;
import com.aliyun.vod.upload.resp.UploadURLStreamResponse;
import com.aliyun.vod.upload.resp.UploadVideoResponse;
import com.movie.VideoApplication;
import com.movie.mq.Sender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VideoApplication.class)
public class NodeApplicationTests {

	//账号AK信息请填写(必选)
	private static final String accessKeyId = "LTAIOymMDH5DQyY2";
	//账号AK信息请填写(必选)
	private static final String accessKeySecret = "ER7SfUVjivxI6Tn3M5YQQAH6a02LBm";

	protected final Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	private Sender sender;
	@Test
	public void contextLoads() {
		Jedis jedis = new Jedis("192.168.20.8",6379);
//		jedis.auth("123");     //密码认证
		System.out.println("Connection to server sucessfully");
		//查看服务是否运行
		logger.info(jedis.get("name"));
		jedis.set("user","namess");
		// System.out.println("Server is running: "+jedis.ping());
		System.out.println(jedis.get("user").toString());
		jedis.set("user","name");
		System.out.println(jedis.get("user"));

	}

	@Test
	public void activemq() {
			sender.send();
			System.out.println("1213213");

	}
	@Test
	public void uploadvideo() {
		//视频标题(必选)
		String title = "测试标题";
		//1.本地文件上传时，文件名称为上传文件绝对路径，如:/User/sample/文件名称.mp4 (必选) 2.网络流上传时，文件名称为源文件名，如文件名称.mp4(必选)。任何上传方式文件名必须包含扩展名
		String fileName = "文件名称.mp4";
//		//本地文件方式上传
//		testUploadVideo(accessKeyId, accessKeySecret, title, fileName);
		//待上传视频的网络流地址
		String url = "http://foxmovie.oss-cn-beijing.aliyuncs.com/1.mp4";
		//网络流方式上传
		testUploadURLStream(accessKeyId, accessKeySecret, title, fileName, url);

	}

	private static void testUploadVideo(String accessKeyId, String accessKeySecret, String title, String fileName) {
		UploadVideoRequest request = new UploadVideoRequest(accessKeyId, accessKeySecret, title, fileName);
		request.setPartSize(10 * 1024 * 1024L);     //可指定分片上传时每个分片的大小，默认为10M字节
		request.setTaskNum(1);   //可指定分片上传时的并发线程数，默认为1，(注：该配置会占用服务器CPU资源，需根据服务器情况指定）
		request.setIsShowWaterMark(true);           //是否使用默认水印
//		request.setCallback("http://callback.sample.com");  //设置上传完成后的回调URL(可选)
		request.setCateId(0);                       //视频分类ID(可选)
		request.setTags("标签1,标签2");              //视频标签,多个用逗号分隔(可选)
		request.setDescription("视频描述");          //视频描述(可选)
		request.setCoverURL("http://foxmoviepic.oss-cn-beijing.aliyuncs.com/1.png"); //封面图片(可选)
		UploadVideoImpl uploader = new UploadVideoImpl();
		UploadVideoResponse response = uploader.uploadVideo(request);
		System.out.print("RequestId=" + response.getRequestId() + "\n");  //请求视频点播服务的请求ID
		if (response.isSuccess()) {
			System.out.print("VideoId=" + response.getVideoId() + "\n");
		} else {
			//如果设置回调URL无效，不影响视频上传，返回VideoId同时会返回错误码。其他情况上传失败时，VideoId为空，此时需要根据返回错误码分析具体错误原因
			System.out.print("VideoId=" + response.getVideoId() + "\n");
			System.out.print("ErrorCode=" + response.getCode() + "\n");
			System.out.print("ErrorMessage=" + response.getMessage() + "\n");
		}
	}
	private static void testUploadURLStream(String accessKeyId, String accessKeySecret, String title, String fileName, String url) {
		UploadURLStreamRequest request = new UploadURLStreamRequest(accessKeyId, accessKeySecret, title, fileName, url);
		request.setShowWaterMark(true);             //是否使用默认水印
//		request.setCallback("http://callback.sample.com");//设置上传完成后的回调URL(可选)
		request.setCateId(0);                       //视频分类ID(可选)
		request.setTags("标签1,标签2");              //视频标签,多个用逗号分隔(可选)
		request.setDescription("视频描述");          //视频描述(可选)
		request.setCoverURL("http://foxmoviepic.oss-cn-beijing.aliyuncs.com/1.png");  //封面图片(可选)
		UploadVideoImpl uploader = new UploadVideoImpl();
		UploadURLStreamResponse response = uploader.uploadURLStream(request);
		System.out.print("RequestId=" + response.getRequestId() + "\n"); //请求视频点播服务的请求ID
		if (response.isSuccess()) {
			System.out.print("VideoId=" + response.getVideoId() + "\n");
		} else {
			//如果设置回调URL无效，不影响视频上传，可返回VideoId同时返回错误码。其他情况上传失败时，VideoId为空，此时需要根据返回错误码分析具体错误原因
			System.out.print("VideoId=" + response.getVideoId() + "\n");
			System.out.print("ErrorCode=" + response.getCode() + "\n");
			System.out.print("ErrorMessage=" + response.getMessage() + "\n");
		}
	}



}
