package com.jda.controller;




import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jda.model.User;

import repository.RepoImpl;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public RegServlet() {
	super();	// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("user is registered");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		String name = request.getParameter("name");
		
		String password = request.getParameter("password");
		String mobile = request.getParameter("mobile");
		
		User user=new User();
		user.setName(name);
		
		user.setPassword(password);
		user.setMobile(mobile);
		RepoImpl  rep=new RepoImpl();
		try {
			
			System.out.println("controller  use r"+ user);
			rep.readDataBase(user);
			RequestDispatcher req=request.getRequestDispatcher("login.html");
	      req.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

