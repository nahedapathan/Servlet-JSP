package com.tka;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/First")
public class FirstServ extends GenericServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String pass=req.getParameter("pass");
		PrintWriter wr=resp.getWriter();
		
		wr.println(name+" "+pass);
	}

}
