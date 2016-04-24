package com.fruit.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.user.dao.UserDao;
import com.fruit.user.service.UserService;
import com.fruit.user.vo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

}
