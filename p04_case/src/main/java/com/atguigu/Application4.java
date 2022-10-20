package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.dao")
//@EnableTransactionManagement //该语句可以省略，底层已经@EnableTransactionManagement
public class Application4 {
	public static void main(String[] args) {
		//SpringApplication.run(Application4.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(Application4.class, args);
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(count-- + "_" + beanDefinitionName);
		}
	}
}
