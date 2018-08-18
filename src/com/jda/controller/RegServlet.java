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

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		String name = request.getParameter("nm");
		String username = request.getParameter("u1");
		
		String password = request.getParameter("pass");
		String mobile = request.getParameter("mobile");
		System.out.println("hi atul"+name +  " " + username + password  + mobile);
		
		User user=new User();
		user.setName(name);
		user.setUserName(username);
		user.setPassword(password);
		user.setMobile(mobile);
		RepoImpl  rep=new RepoImpl();
		try {
			
			System.out.println("controller  use r"+ user);
			rep.readDataBase(user);
			RequestDispatcher req=request.getRequestDispatcher("login.jsp");
	      req.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

