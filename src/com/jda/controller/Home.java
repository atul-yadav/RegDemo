package com.jda.controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jda.model.User;

public class Home  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 *      /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
		response.sendRedirect("login.jsp");
		/*
			User user = (User) session.getAttribute("user");
			String name = user.getName();
			System.out.println(name);
	      request.setAttribute("name", name);
			//response.sendRedirect("home.jsp");
         RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
         System.out.println(user);
			rd.forward(request, response);
		//}
		return;
		*/
	}

}

