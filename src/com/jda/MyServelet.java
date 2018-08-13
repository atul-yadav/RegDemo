package com.jda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyServelet  extends  HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("nm");
		String userName = req.getParameter("u1");
		String password = req.getParameter("pass");
		String mobile = req.getParameter("mobile");
		String password1= req.getParameter("pass1");
		
		if (name.trim().isEmpty() || userName.trim().isEmpty() || password.trim().isEmpty() || mobile.trim().isEmpty() 
				|| password1.trim().isEmpty())
		{
				System.out.println("fields requiredl");
		}
		else
		{
			System.out.println(name);
			System.out.println(userName);
			System.out.println(password);
			System.out.println(mobile);
		
		}
		
		/*
		if (name != null )
		{
			System.out.println(name);
		}
		else
		{
			System.out.println("name can't be null");
		}
		if (userName != null )
		{
			System.out.println(userName);
		}
		else
		{
			System.out.println("can't be null");
		}
		if (email  != null )
		{
			System.out.println(email);
		}
		else
		{
			System.out.println("can't be null");
		}
		if (mobile  != null )
		{
			System.out.println(mobile);
		}
		else
		{
			System.out.println("can't be null");
		}
		
		if (address != null )
		{
			System.out.println(address);
		}
		else
		{
			System.out.println("can't be null");
		}
		
		if (password != password1)
		{
			System.out.println("password does not match");
		}
		
	
		System.out.println(name);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(address);
		
	/*
		System.out.println(req.getParameter("nm"));
		System.out.println(req.getParameter("u1"));
		
		System.out.println(req.getParameter("pass"));
		System.out.println(req.getParameter("mobile"));
		*/
		
		
		
	}
	
	
	
}
