package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("port = " + port);
		return "hello spring boot!!";
	}
}