package com.fruit.user.dao;

import java.util.List;

import com.fruit.user.vo.User;

public interface UserDao {
	/**
	 * 查询
	 * @param user
	 * @return
	 */
	public List<User> findUsersByVO(User user);
	/**
	 * 增加User
	 * @param user
	 */
	public void addUser(User user);
}
