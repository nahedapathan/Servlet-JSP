package com.nk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycleDemoServlet")
public class LifeCycleDemoServlet extends HttpServlet {
	
	private int counter;
	
	@Override
	public void init() throws ServletException {
		counter =0;
		System.out.println("Init() method Called :Servlet Initialized Counter is set to be zero");
		
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		counter++;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>Servlet LifeCycle demo</h1>");
		out.println("<p>Request Count:"+counter+"</p>");
		out.println("</body></html>");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Destroy method invoked bye bye.......");
	}

}
