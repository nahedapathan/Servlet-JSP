package com.nk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/UserInput")
public class UserInput extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>User Input Receieved: </h1>");
		out.println("<p>"+name+"</p>");
		out.println("<p>"+age+"</p>");
		out.println("</body></html>");
		
	}

	
}
