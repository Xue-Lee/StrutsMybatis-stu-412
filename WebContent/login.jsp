<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">学生登录</h2>
<form action="stuAction!stuLogin" method="post">
<table align="center">
	<tr><td>学生编号</td><td><input type="text" name="stuId"/></td></tr>
	<tr><td>学生姓名</td><td><input type="text" name="stuName"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="登录"/></td></tr>
</table>
</form>
</body>
</html>