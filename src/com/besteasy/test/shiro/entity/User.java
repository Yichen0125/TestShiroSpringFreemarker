package com.besteasy.test.shiro.entity;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable{
	private Integer id;
	private String userName;
	private String password;
	private String salt;
	
	//该用户拥有的角色
	private Role role;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", salt=" + salt + ", role="
				+ role + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}

	public User() {
		super();
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User(Integer id, String userName, String password, String salt, Role role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.salt = salt;
		this.role = role;
	}
	
	
	
}
