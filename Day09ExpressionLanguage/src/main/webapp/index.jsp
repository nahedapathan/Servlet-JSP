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
        request.setAttribute("request_name", "Naheda Khan");
        //out.println(request.getAttribute("request_name"));
     %>
     <h3>Hello: ${requestScope.request_name}</h3>
     
     <form action="output.jsp" method="get">
          <input type="text" name="name1" placeholder="Enter Name"/>
          <input type="submit" value="Click Me"/>
     </form>
</body>
</html>