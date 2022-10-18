package com.atguigu;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserService {
	@Autowired
	private UserService userService;

	@Test
	public void testFindAll() {
		List<User> users = this.userService.findAll();
		users.forEach(System.out::println);
	}

	@Test
	public void testDelete() {
		this.userService.deleteUser(2);
	}
}
