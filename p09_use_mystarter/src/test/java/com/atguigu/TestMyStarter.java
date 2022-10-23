package com.atguigu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class TestMyStarter {
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataSource() {
		System.out.println(dataSource.getClass());
		//System.out.println(dataSource);
		//System.out.println(dataSource.getConnection());
	}
}
