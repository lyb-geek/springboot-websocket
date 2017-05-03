package com.springboot.websocket.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/app/")
public class WebSocketController {
	@RequestMapping(value = "index")
	public String index() {
		System.out.println("index....");
		return "index";
	}

}
