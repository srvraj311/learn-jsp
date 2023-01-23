package com.srvraj311;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// int out = Integer.parseInt(req.getParameter("k"));
		// HttpSession session = req.getSession();
		// int out = (int) session.getAttribute("k");
		// data is recieved using query params

		// Recieving data using Cookie
		int out = 0;
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("k")) {
				out = Integer.parseInt(cookie.getValue());
				out = out * out;
			}
		}

		resp.getWriter().println("Square is : " + out);
		// Also we can delete the value once set but only if it exists
		// session.removeAttribute("k");
	}
}
