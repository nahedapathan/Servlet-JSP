<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>Welcome to Naheda World</h3>
  <%
     String name="Naheda Khan";
     int leng=name.length();
  %>
  <%= leng %>
  
  
  <%!
     int a=10;
     String name="naheda";
     int square()
     {
    	 return a*a;
     }
  %>
  
  <%
         out.println("a :"+a);
         out.println("Name: "+name);
         out.println("Square: "+square());
         
        
  %>
  
  
  <%
     int b=20;
    if(b<100)
    {
    	out.println("b is smaller than 100");
    }
    else
    {
    	out.println("b is greater than 100");
    }
    
    for(int i=1;i<=5;i++)
    {
    	out.println(i);
    }
   %>
   
   
   <%= LocalDate.now() %>
   
   
   <%= Math.random() %>
</body>
</html>