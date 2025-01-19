package com.nk;

import java.io.IOException;
import java.io.PrintWriter;

import com.dao.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginForm")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		
		String password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		DBConnection db=new DBConnection();
		db.LoginData(name,password);
		
		
		
	}

}
