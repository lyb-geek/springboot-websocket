package com.springboot.websocket.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * <p>
 * Title: SpringbootWebsocketApplication
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author linyb
 * @date 2017年2月20日
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebsocketApplication.class, args);
	}
}
