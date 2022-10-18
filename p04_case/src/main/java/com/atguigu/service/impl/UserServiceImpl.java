package com.atguigu.service.impl;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		//从redis中获取用户列表key:userList
		List<User> userList = (List<User>) redisTemplate.boundValueOps("userList").get();
		//如果redis中不存在就查询数据库，并且放入redis中
		if (userList == null) {
			userList = userMapper.selectAll();
			redisTemplate.boundValueOps("userList").set(userList);
			System.out.println("from DataBase");
		} else {
			System.out.println("from Redis");
		}
		//返回用户列表
		return userList;
		//return userMapper.selectAll();
	}

	@Override
	@Transactional
	public void deleteUser(Integer id) {
		userMapper.deleteByPrimaryKey(id);
		int i = 10 / 0;
		userMapper.deleteByPrimaryKey(id + 1);
	}
}
