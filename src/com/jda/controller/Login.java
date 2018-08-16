package com.jda.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.RepoImpl;



public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RepoImpl  rep=new RepoImpl();
		boolean bool;
		try {
			bool = rep.auhtorization(username,password);
			if(bool)
		    {
		   	 System.out.println("password is matched");
		   	 
		   	 response.sendRedirect("home.jsp");
		    }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	    
	   
	}

}

