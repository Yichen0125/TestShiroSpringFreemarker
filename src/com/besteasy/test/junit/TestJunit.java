package com.besteasy.test.junit;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJunit {
	ApplicationContext ioc = null;
	{
		ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void Test01() throws SQLException{
		DataSource dataSource = ioc.getBean(DataSource.class);
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}
	
	public void insert() throws SQLException{
		DataSource dataSource = ioc.getBean(DataSource.class);
	}
}
