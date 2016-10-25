<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	登陆成功<br><br>
	<@shiro.hasRole name="user1">
		<a href="toAdmin">To Admin JSP</a><br><br>
	</@shiro.hasRole>
	<@shiro.hasRole name="user2">
		<a href="toUser">To User JSP</a><br><br>
	</@shiro.hasRole>
	<@shiro.hasRole name="user1">
		<a href="show">展示所有的用户</a><br><br>
	</@shiro.hasRole>
	
	
	<a href="logout">登出</a><br><br>
</body>
</html>