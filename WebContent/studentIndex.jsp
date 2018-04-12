<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>主页</h1>
<hr>
<table width="800" border="1" cellspacing="0">
	<tr><td>学号</td><td>${student.stuId }</td><td>姓名</td><td>${student.stuName }</td></tr>
	<tr><td>性别</td><td>${student.sex }</td><td>出生日期</td><td>${student.birthday }</td></tr>
	<tr><td>班级</td><td>${student.dept }</td><td>学分</td><td>${student.grade }</td></tr>
</table>
<hr>
<table width="800" border="1" cellspacing="0">
	<tr><td>编号</td><td>课程</td><td>成绩</td><td>学分</td><td>课时</td></tr>
	<c:forEach items="${scoreList }" var="score">
	<tr>
		<td>${score.scoreId }</td>
		<td>${score.courseName }</td>
		<td>${score.val }</td>
		<td>${score.courseTimes }</td>
		<td>${score.courseGrade }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>