package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sq") -- we can use annotations as well instead of web.xml
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = 0;
		// getting k value comming from AddServlet while using RequestDispatcher
		// k = (int) req.getAttribute("k");

		// getting the k value from the url query parameters while using Redirect
		// k = Integer.parseInt(req.getParameter("k"));

		// getting k value from session
		// HttpSession session = req.getSession();
		// k = (int) session.getAttribute("k");

		// getting k value from cookies
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

		// sqaring the number
		int result = k * k;

		// to show the result on the web page
		PrintWriter out = res.getWriter();
		out.println("Hello, you are in square Servlet with square value :" + result);
	}
}
