package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
//@CrossOrigin//解决跨域请求错误
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	public Result findAll() {
		List<User> userList = this.userService.findAll();
		Result result = Result.ok(userList);
		result.setMsg("查询成功");
		return result;
	}
}
