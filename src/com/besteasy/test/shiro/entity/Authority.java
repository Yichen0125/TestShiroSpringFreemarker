package com.besteasy.test.shiro.entity;

public class Authority {
		private Integer authorityId;
		//权限的名字, 用于显示
		private String authoritiesName;
		//权限的名字: 用于配置 Shiro
		private String shiroName;
		//URL 地址
		private String url;
		public Integer getAuthorityId() {
			return authorityId;
		}
		public void setAuthorityId(Integer authorityId) {
			this.authorityId = authorityId;
		}
		@Override
		public String toString() {
			return "Authority [authorityId=" + authorityId + ", authoritiesName=" + authoritiesName + ", shiroName="
					+ shiroName + ", url=" + url + "]";
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		
		
		/**
		 * @param authorityId
		 * @param authoritiesName
		 * @param name
		 * @param url
		 */
		public String getAuthoritiesName() {
			return authoritiesName;
		}
		public Authority(Integer authorityId, String authoritiesName, String shiroName, String url) {
			super();
			this.authorityId = authorityId;
			this.authoritiesName = authoritiesName;
			this.shiroName = shiroName;
			this.url = url;
		}
		public String getShiroName() {
			return shiroName;
		}
		public void setShiroName(String shiroName) {
			this.shiroName = shiroName;
		}
		public void setAuthoritiesName(String authoritiesName) {
			this.authoritiesName = authoritiesName;
		}
		public Authority() {
			super();
		}
		
		
}
