package com.cbay.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cbay.dao.UserDao;
import com.cbay.mapper.UserMapper;
import com.cbay.model.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectUserById(int userId) {

		User user = userMapper.selectUserById(userId);
		return user;
	}

}
