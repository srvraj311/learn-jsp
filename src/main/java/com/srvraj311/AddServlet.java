package com.srvraj311;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		out.print("Hi <br>");

		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("phone");

		ServletConfig cfg = getServletConfig();
		String cfgStr = cfg.getInitParameter("name");

		out.println(cfgStr);
	}

}
