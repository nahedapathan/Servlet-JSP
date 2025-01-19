package in.sp.controllers;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.dbcon.DBConnection;
import in.sp.model.User;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("password1");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		try
		{
			Connection conn=DBConnection.getConnection();
			String query="SELECT * FROM register WHERE email=? AND password=?";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setString(1, myemail);
			pstmt.setString(2, mypass);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				User user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
				
				HttpSession session=req.getSession();
				session.setAttribute("session_user", user);
				
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
				
			}
			else
			{
				out.println("<h3 style='color:red'>Email Id and Password didnt Matched</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
