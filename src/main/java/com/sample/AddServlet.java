package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/add") -- we can use annotations as well instead of web.xml
public class AddServlet extends HttpServlet {

	/*
	 * doPost() method restrict the client to use a get or any other request except
	 * post for this servlet, similaly doGet() method will restrict the user/client
	 * to use only a get request for the servlet
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		
		/*
		 * Calling a servlet from another servlet: To do this we use RequestDispatcher
		 * and Redirect -- In RequestDispatcher we are calling the servelet by not
		 * changing any thing in url in the browser. -- In redirect our url changes,
		 * corresponding to the servlet we are calling, here sq
		 */

		/* By using RequestDispather */
		// adding "k" value to req object to use it in SquareServlet
//		req.setAttribute("k", k);
		// sq will be referenced from web.xml
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);

		/* By using Redirect */
		// res.sendRedirect("sq?k="+k);

		/*
		 * By using HttpSession Here, we will get a hold of the user;s session through
		 * HttpSession class, set some attributes to it and use it in another servlet.
		 */
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");

		/* By using Cookies */
		Cookie cookie = new Cookie("k", String.valueOf(k));
		res.addCookie(cookie);
		res.sendRedirect("sq");

	}

}
