package com.atguigu;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@ExtendWith({SpringExtension.class}) Junit5  RunWith Junit4
@SpringBootTest  //表明这是一个SpringBoot的测试类，整合Junit5
public class TestUserMapper {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindAll() {
		List<User> users = this.userMapper.selectAll();
		users.forEach(System.out::println);
	}
}
