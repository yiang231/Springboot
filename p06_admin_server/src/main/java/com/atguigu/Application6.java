package com.atguigu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Application6 {
	public static void main(String[] args) {
		SpringApplication.run(Application6.class, args);
	}
}
