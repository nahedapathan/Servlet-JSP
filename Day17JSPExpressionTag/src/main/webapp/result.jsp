<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
  <h2>Result :</h2>
  <%
    String username=request.getParameter("username");
  if(username==null || username.isEmpty())
  {
	  username="Guest";
  }
  %>
  
  <p>
     Welcome ,<%=username %>!
  </p>
  
  <h3>Including Footer: </h3>
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>