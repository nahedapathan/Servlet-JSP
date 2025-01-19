package com.tka;


import java.io.IOException;

import com.tka.service.userService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class FirstServ extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("uname");
		int age=Integer.parseInt(req.getParameter("age"));
		String address=req.getParameter("address");
		String moNum=req.getParameter("moNum");
		
		System.out.println(name+age+address+moNum);
		
		userService service=new userService();
		service.insert(name, age, address, moNum);
		System.out.println(name+age+address+moNum);
		
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
