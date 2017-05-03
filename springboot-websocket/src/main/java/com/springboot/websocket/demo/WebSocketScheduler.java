package com.springboot.websocket.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 * <p>
 * Title: JokeScheduler
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author linyb
 * @date 2017年2月17日
 */
@Component
public class WebSocketScheduler {

	public static final String WEBSOCKET_MESSAGE_TOPIC_PATH = "/topic/notify";
	@Autowired
	private SimpMessagingTemplate brokerMessagingTemplate;

	@Scheduled(cron = "0 0/1 * * * ?") //
	public void webSocketScheduler() {
		System.out.println("定时器开始调度。。。");
		MyMessage message = new MyMessage();
		message.setContent("我是服务器->" + new Random().nextInt(100));
		brokerMessagingTemplate.convertAndSend(WEBSOCKET_MESSAGE_TOPIC_PATH, message);
		System.out.println("定时器调度结束。。。");
	}

}
