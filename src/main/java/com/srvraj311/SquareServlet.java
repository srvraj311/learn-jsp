package com.srvraj311;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// int out = Integer.parseInt(req.getParameter("k"));
		HttpSession session = req.getSession();
		int out = (int) session.getAttribute("k");
		// data is recieved using query params
		out = out * out;
		resp.getWriter().println("Square is : " + out);
	}
}
