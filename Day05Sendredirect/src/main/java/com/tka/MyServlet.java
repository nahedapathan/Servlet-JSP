package com.tka;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mySearch=req.getParameter("search1");
		//resp.sendRedirect("https://www.google.com");
		resp.sendRedirect("https://www.google.com/search?q="+mySearch);
	}
}
