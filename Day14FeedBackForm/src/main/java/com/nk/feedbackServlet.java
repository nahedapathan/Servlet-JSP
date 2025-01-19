package com.nk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/feedbackForm")
public class feedbackServlet extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rating=req.getParameter("rating");
		String comment=req.getParameter("comment");
		
		PrintWriter out=resp.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Feedback Confirmation</h2>");
		out.println("<p>Rating :"+rating+"</p>");
		out.println("<p>Comment :"+comment+"</p>");
		out.println("</body></html>");
	}

}
