package com.atguigu.controller;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/findAll")
	public List<User> findUsers() {
		return this.userService.findUsers();
	}

	@PostMapping("/save")
	public void saveUser(@RequestBody User user) {
		this.userService.saveUser(user);
	}
}
