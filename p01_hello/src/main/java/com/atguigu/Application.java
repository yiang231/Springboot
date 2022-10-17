package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //这是SpringBoot的启动类
//Starter场景启动器
//默认访问当前包（com.atguigu）及其子包下的注解
public class Application {
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(count-- + "_" + beanDefinitionName);
		}
	}
}

