package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.List;

public interface UserService {

	//查询所有用户信息
	public List<User> findAll();

	public void deleteUser(Integer id);
}