package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
*配置类，代表可以手动创建对象并且放入IoC容器
@EnableAutoConfiguration //启用自动的配置
* @AutoConfigurationPackage
* * @Import(AutoConfigurationPackages.Registrar.class)
* @Import(AutoConfigurationImportSelector.class)
@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
* 组件扫描，扫描这个类及其子包下的注解
* */
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
/**
 * 将一个对象交给Spring来管理的三种做法
 * 1.@Bean
 * 2.@Componment（三层架构注解归为一类）
 * 3.@Import
 * @Import注解只有一个value方法，注释中指明该注解必须作用于@Configuration定义的类上，value可以为想要交给Spring管理的类文件数组，ImportSelector或者ImportBeanDefinitionRegistrar
 */
	/*@Bean
	public DataSourceProperties dataSourceProperties() {
		return dataSourceProperties();
	}*/
}

