package com.revature.bankapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
//		PrintWriter out=response.getWriter();
//		out.println("Email: "+email);
//		out.println("Password: "+password);
		
		boolean isValidUser = false;
		try {
			UserDAO userdao=new UserDAO();
			isValidUser=userdao.login(email, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(isValidUser) {
			response.sendRedirect("home.jsp");
		}else {
			response.sendRedirect("login.jsp?message=Invalid Login credentials");
		}
		
	}
}
