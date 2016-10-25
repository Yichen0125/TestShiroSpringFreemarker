package com.besteasy.test.shiro.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Role {
		private Integer roleId;
		// 角色名称
		private String name;
		// 角色拥有的权限
		private List<Authority> authorities = new ArrayList<>();
		//该角色分配给了哪些用户
		private Set<User> users = new HashSet<>();
		
		public Role() {
			super();
		}

		public Role(Integer roleId, String name, List<Authority> authorities, Set<User> users) {
			super();
			this.roleId = roleId;
			this.name = name;
			this.authorities = authorities;
			this.users = users;
		}

		public Integer getRoleId() {
			return roleId;
		}

		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Authority> getAuthorities() {
			return authorities;
		}

		public void setAuthorities(List<Authority> authorities) {
			this.authorities = authorities;
		}

		public Set<User> getUsers() {
			return users;
		}

		public void setUsers(Set<User> users) {
			this.users = users;
		}

		@Override
		public String toString() {
			return "Role [roleId=" + roleId + ", name=" + name + ", authorities=" + authorities + ", users=" + users
					+ "]";
		}
}
