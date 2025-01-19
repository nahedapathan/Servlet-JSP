package com.tka;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/LoginForm")
public class Login extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch194","root","tiger123");
			
			String query="SELECT * FROM register WHERE email=? and password=?";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setString(1, myemail);
			pstmt.setString(2, mypass);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				HttpSession session=req.getSession();
				session.setAttribute("session_name", rs.getString("name"));
				
				
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}
			else
			{
				out.println("<h3 style='color:red'>Email id and password didnt matched</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setContentType("text/html");
			out.println("<h3 style='color:red'>"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
	}

}
