package com.srvraj311;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		PrintWriter out = res.getWriter();
		out.println("Result is : " + k);

		// req.setAttribute("k", k);

		// Call another servlet
		// 1. Request Dispatcher :
		// RequestDispatcher rd = req.getRequestDispatcher("sq");
		// rd.forward(req, res);
		// in this case the url willl be abstracted from user

		// 2. Redirect
		res.sendRedirect("sq?k=" + k);
		// data is being passed by query params

		// Send data between servlets
		// 1. Session Management
	}

}
