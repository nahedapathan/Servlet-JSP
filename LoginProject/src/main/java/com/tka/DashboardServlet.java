package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import com.tka.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dash")
public class DashboardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");

		//int age=(Integer) req.getAttribute("age");
		User user=(User)req.getAttribute("user");
		
		resp.setContentType("Text/html");
		PrintWriter wr=resp.getWriter();
		
		
		wr.println("<h1>Welcome"+uname+user.name+" "+user.mobileNo+" "+user.address+"</h1>");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
