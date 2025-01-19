<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>
    <table>
      <form >
           <tr>
               <td><label for="num1">Number 1: </label></td> 
                <td><input type="number" id="num1" name="num1"></td>
           </tr>
           <tr>
           <td><label for="num2">Number 2: </label></td> 
                <td><input type="number" id="num2" name="num2"></td>
           </tr>
           <tr>
                  <td colspan="2"><input type="submit" value="ADD"></td>
           </tr>
      </form>
    
    </table>


   <%
      String s1=request.getParameter("num1");
      String s2=request.getParameter("num2");
      
      if(s1!=null && s2!=null){
      int n1=Integer.parseInt(s1);
      int n2=Integer.parseInt(s2);
      int sum=n1+n2;
      
   
   %>
   
   <h1>Addition :<%=sum %></h1>
   
   <%} %>
</body>
</html>