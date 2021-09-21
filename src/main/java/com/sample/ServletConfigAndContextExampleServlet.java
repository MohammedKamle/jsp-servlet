package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigAndContextExampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("Hello ");

		/*
		 * -- ServletContext(represented in <context-param> in web.xml) and
		 * ServletConfig(represented by <init-param> in web.xml under a particular
		 * Servlet) are two approaches through which we get the parameter values from
		 * web.xml file. -- ServletContext is used when parameter value is common among
		 * all the Servlets while ServletConfig is used when we want to assign a
		 * specific value for a particular Servlet. -- If we have same parameters in both,
		 * then ServletConfig will have higher priority as it is specific for a Servlet
		 */

		// Using ServletContext
//		ServletContext context = getServletContext();
//		String name = context.getInitParameter("name");
//		String phone = context.getInitParameter("phone");
//		out.print(name+", thanks for sharing your contact info :"+phone);

		// Using ServletConfig
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		String phone = config.getInitParameter("phone");
		out.print(name + ", thanks for sharing your contact info :" + phone);

	}

}
