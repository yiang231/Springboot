package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.dao")
public class Application4 {
	public static void main(String[] args) {
		SpringApplication.run(Application4.class, args);
	}
}
