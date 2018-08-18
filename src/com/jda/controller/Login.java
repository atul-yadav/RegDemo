package com.jda.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jda.model.User;

import repository.RepoImpl;



public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("nm");
		
		
		 
		
		
		
		
		
		RepoImpl  rep=new RepoImpl();
		boolean bool;
		try {
			bool = rep.auhtorization(username,password);
			if(bool)
		    {
				HttpSession session = request.getSession();
				session.setAttribute("name", username);
				response.sendRedirect("home.jsp");
				System.out.println("session created");
				
		   	 //System.out.println("password is matched");
		   	 
		   	// response.sendRedirect("home.jsp");
		    }
			else
			{
				RequestDispatcher req = request.getRequestDispatcher("login.jsp");
				request.setAttribute("error", "2");
				req.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	    
	   
	}

}

