package com.besteasy.test.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.besteasy.test.shiro.entity.User;
import com.besteasy.test.shiro.mapper.UserMapper;

@org.springframework.stereotype.Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	//@RequiresRoles("tester")
	public User getByUserName(String username) {
		User user = userMapper.getUserByName(username);
		return user;
	}
	
	
	
}
