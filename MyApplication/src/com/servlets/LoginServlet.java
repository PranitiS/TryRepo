package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		if(username.equals("citi") && password.equals("citi"))	{
			String message = "Welcome " + username;
			writer.println(message);
		}
		else	{
			//writer.println("Sorry please login again");
			//Use Request Dispatcher Here
			RequestDispatcher dispatcher = req.getRequestDispatcher("form.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
