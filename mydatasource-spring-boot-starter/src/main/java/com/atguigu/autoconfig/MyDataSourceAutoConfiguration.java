package com.atguigu.autoconfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.properties.MyDataSourceProperties;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootConfiguration
//@Configuration
public class MyDataSourceAutoConfiguration {
	@Autowired
	private MyDataSourceProperties dataSourceProperties;

	public MyDataSourceProperties getDataSourceProperties() {
		return dataSourceProperties;
	}

	public void setDataSourceProperties(MyDataSourceProperties dataSourceProperties) {
		this.dataSourceProperties = dataSourceProperties;
	}

	@Bean
	@ConditionalOnProperty(value = "spring1.jdbc2.datasource3.type", havingValue = "druid", matchIfMissing = true)
	public DataSource druidDataSource() {
		System.out.println(dataSourceProperties);
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
		dataSource.setUrl(dataSourceProperties.getUrl());
		dataSource.setUsername(dataSourceProperties.getUsername());
		dataSource.setPassword(dataSourceProperties.getPassword());
		return dataSource;
	}

	@Bean
	@ConditionalOnProperty(value = "spring1.jdbc2.datasource3.type", havingValue = "c3p0")
	public DataSource createC3P0DataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(dataSourceProperties.getDriverClassName());
		dataSource.setJdbcUrl(dataSourceProperties.getUrl());
		dataSource.setUser(dataSourceProperties.getUsername());
		dataSource.setPassword(dataSourceProperties.getPassword());
		return dataSource;
	}


}
