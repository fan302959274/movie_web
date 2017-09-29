package com.node;

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

}
