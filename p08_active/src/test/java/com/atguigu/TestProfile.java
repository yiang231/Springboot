package com.atguigu;

import com.atguigu.properties.DataSourceProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
java.lang.IllegalStateException:
 Unable to find a @SpringBootConfiguration,
 you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test
 */
@SpringBootTest
public class TestProfile {
	@Autowired
	private DataSourceProperties dataSourceProperties;

	@Test
	public void testActive() {
		System.out.println(dataSourceProperties);
	}
}
