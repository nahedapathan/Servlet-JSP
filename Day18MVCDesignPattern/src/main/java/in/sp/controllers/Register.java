package in.sp.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sp.dbcon.DBConnection;

@WebServlet("/regForm")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("password1");
		String mycity = req.getParameter("city1");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");

		try {
			Connection conn = DBConnection.getConnection();
			String query="INSERT INTO register VALUES(?,?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setString(1, myname);
			pstmt.setString(2, myemail);
			pstmt.setString(3, mypass);
			pstmt.setString(4,mycity);
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				out.println("<h3 style='color:green'>Registered Successfully </h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
			else
			{
				out.println("<h3 style='color:red'>User not Registered due to some error</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.html");
				rd.include(req, resp);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
