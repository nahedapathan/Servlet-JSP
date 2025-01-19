package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regForm")
public class Registration extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rollno=req.getParameter("rollno");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		
		PrintWriter out=resp.getWriter();
		
		out.println("<html><body>");
		out.println("<h1 style='color:green'>User Input Received : </h1>");
		out.println("<p>"+rollno+"</p>");
		out.println("<p>"+name+"</p>");
		out.println("<p>"+age+"</p>");
		out.println("<p>"+email+"</p>");
		out.println("<p>"+course+"</p>");
		out.println("</body></html>");
		
	}

}
