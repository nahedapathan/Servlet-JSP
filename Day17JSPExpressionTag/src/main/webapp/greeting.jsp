
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greeting</title>
</head>
<body>
    <h1>Welcome to JSP Example</h1>
    
    <%
       String name="Naheda";
       int age=20;
       out.println("<p>Name: "+name+"</p>"+"<br>Age: "+age);
      

    %>
    
    <form action="result.jsp" method="post">
    
    <label for="username">Enter your Name:</label>
    <input type="text" id="username" name="username">
    <button type="submit" value="submit">Submit</button>
    
    </form>
</body>
</html>