<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <%
       //String myname=(String)request.getAttribute("name_key");
     String myname=(String)session.getAttribute("name_key");
     %>
	<h3>Welcome :<%= myname %></h3>
	
	<a href="home.jsp">Home</a> &nbsp;&nbsp;
	<a href="about_us.jsp">About us</a>
	<a href="logout">Logout</a>
</body>
</html>