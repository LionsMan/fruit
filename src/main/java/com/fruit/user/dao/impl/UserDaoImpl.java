package com.fruit.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fruit.base.dao.impl.MongoDaoImpl;
import com.fruit.user.dao.UserDao;
import com.fruit.user.vo.User;

@Component
public class UserDaoImpl extends MongoDaoImpl<Object> implements UserDao {

	@Override
	public List<User> findUsersByVO(User user) {
		return null;
	}

	@Override
	public void addUser(User user) {
		super.save(user);
	}

}
