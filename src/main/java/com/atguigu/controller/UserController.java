package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/hello")
	public String hello() {
		return "Spring Boot initializr!!!1";
	}
}
