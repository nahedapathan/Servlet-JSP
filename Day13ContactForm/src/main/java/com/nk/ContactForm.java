package com.nk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class ContactForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String message=req.getParameter("message");
		
        PrintWriter out=resp.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Feedback Confirmation</h2>");
		out.println("<p>Name :"+name+"</p>");
		out.println("<p>Email :"+email+"</p>");
		out.println("<p>Message :"+message+"</p>");
		out.println("</body></html>");
	}
}
