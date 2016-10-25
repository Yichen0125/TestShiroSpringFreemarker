package com.besteasy.test.shiro.mapper;

import org.apache.ibatis.annotations.Param;

import com.besteasy.test.shiro.entity.User;

public interface UserMapper {
	/**
	 * 
	 * @param username
	 * @return
	 */
	User getUserByName(@Param("username") String username);
	
}
