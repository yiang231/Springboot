package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application2 {
	//静态资源类 org.springframework.boot.autoconfigure.web.ResourceProperties

	/**
	 * Locations of static resources. Defaults to classpath:
	 * [/META-INF/resources/, /resources/, /static/, /public/].
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application2.class, args);
	}
}
