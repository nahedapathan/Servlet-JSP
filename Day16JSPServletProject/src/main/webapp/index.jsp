<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
     body{
      text-align: center;
     }
     
     h1{
     color:green;
     font-size:bold;
     }
     
     p{
     color:rgb(255,120,0);
     font-size:x-large;
     }

</style>
</head>
<body>
  <h1>Hello</h1>
  <p>
  <%
      out.print("Welcome First JSP Page");
  %>
  <a href="add.jsp">Addition</a>
  </p>
</body>
</html>