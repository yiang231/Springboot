package com.atguigu.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSourceProperties {
	@Value("${spring.jdbc.datasource.driverClassName}")
	private String driverClassName;
	@Value("${spring.jdbc.datasource.url}")
	private String url;
	@Value("${spring.jdbc.datasource.username}")
	private String uname;//username
	@Value("${spring.jdbc.datasource.password}")
	private String pwd; //password
	//没有提供getter和setter方法

	@Override
	public String toString() {
		return "DataSourceProperties{" +
				"driverClassName='" + driverClassName + '\'' +
				", url='" + url + '\'' +
				", uname='" + uname + '\'' +
				", pwd='" + pwd + '\'' +
				'}';
	}
}
