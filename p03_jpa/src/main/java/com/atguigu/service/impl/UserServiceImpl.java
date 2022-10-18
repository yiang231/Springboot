package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findUsers() {
		return this.userDao.findAll();
	}

	@Override
	public User findUserById(Integer id) {
		//return this.userDao.getOne(id);
		return userDao.findById(id).get();
	}

	@Override
	public void saveUser(User user) {
		this.userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		this.userDao.save(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		this.userDao.deleteById(id);
	}
}
