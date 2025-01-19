<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
       form
       {
       display:flex;
       flex-direction:column;
       width:300px;
       
       }
       input
       {
       margin:10px;
       }
       
       
       button
       {
          width:50px;
          background-color:green;
       }

</style>


</head>
<body>

  <form action="First">
      <input type="text" name="uname" placeholder="name">
      <input type="number" name="age" placeholder="age">
      <input type="text" name="address" placeholder="address">
      <input type="text" name="moNum" placeholder="Mobile -no">
      
      <button type="submit">Insert</button>
      
  </form>
  
  
  <form action="show">
           <button type="submit">show record</button>
     
  </form>
</body>
</html>