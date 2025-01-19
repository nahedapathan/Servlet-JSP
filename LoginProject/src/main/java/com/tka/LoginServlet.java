package com.tka;

import java.io.IOException;

import com.tka.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		//req.setAttribute("age", 20);
		req.setAttribute("user", new User(uname,99999,"pune"));
		
		if(uname.equalsIgnoreCase("xyz") && pass.equalsIgnoreCase("xyz@123"))
		{
			//resp.sendRedirect("dashboard.html");
			RequestDispatcher rd=req.getRequestDispatcher("/dash");
			rd.forward(req, resp);
		}
		else
		{
			resp.sendRedirect("index.html");
		}
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		}

}
