package com.atguigu.controller;

import com.atguigu.properties.DataSourceProperties;
import com.atguigu.properties.DataSourceProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${server.port}")
	private String port;
	@Autowired
	private DataSourceProperties dataSourceProperties;
	@Autowired
	private DataSourceProperties2 dataSourceProperties2;

	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("port = " + port);
		System.out.println("dataSourceProperties = " + dataSourceProperties);
		System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
		return "hello spring boot!!";
	}
}