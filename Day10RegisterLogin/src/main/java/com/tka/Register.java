package com.tka;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	
    
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		String mycity=req.getParameter("city1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch194","root","tiger123");
			
            String query="INSERT INTO register VALUES(?,?,?,?,?)";
		    PreparedStatement pstmt=conn.prepareStatement(query);
		    pstmt.setString(1, myname);
		    pstmt.setString(2,myemail);
		    pstmt.setString(3, mypass);
		    pstmt.setString(4, mygender);
		    pstmt.setString(5, mycity);
		    
		    
		    int count=pstmt.executeUpdate();
		    if(count>0)
		    {
		    	resp.setContentType("text/html");
		    	out.println("<h3 style='color:green'>User Registered Successfully</h3>");
		    	
		    	RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
		    	rd.include(req, resp);
		    }
		    else
		    {
		    	resp.setContentType("text/html");
		    	out.println("<h3 style='color:red'>User not registered due to some error</h3>");
		    	
		    	RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
		    	rd.include(req, resp);
		    }
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setContentType("text/html");
	    	out.println("<h3 style='color:red'>User not registered due to some error</h3>");
	    	
	    	RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
	    	rd.include(req, resp);
		}
		
	}

}
