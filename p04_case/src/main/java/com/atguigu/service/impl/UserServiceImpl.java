package com.atguigu.service.impl;

import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userMapper.selectAll();
	}

	@Override
	@Transactional
	public void deleteUser(Integer id) {
		userMapper.deleteByPrimaryKey(id);
		int i = 10 / 0;
		userMapper.deleteByPrimaryKey(id + 1);
	}
}
