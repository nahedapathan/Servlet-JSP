package com.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyLogin")
public class Login extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myemail=(String) req.getParameter("name1");
		String pass=(String) req.getParameter("pass1");
		
		if(myemail.equals("deepak@gmail.com") && pass.equals("depak123"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("Failed");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
