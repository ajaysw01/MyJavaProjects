package com.aj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Second
 */

public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		String year = req.getParameter("year");
		//read data  from the html from Session attributes by accessing the Session object
		HttpSession session = req.getSession(false);
		int id = (Integer)session.getAttribute("id");
		String name =(String) session.getAttribute("name");
		pw.println("<h1>Hello "+id+":"+name+"from "+year+"</h1>");
		
		//invalidate the Session
		 session.invalidate();
		 // here we can write jdbc  code to insert both forms data as record in db table

		 
		 //add home hyperlink
		  pw.println("<br> <a href='index.jsp'>home </a>");
		 pw.close();


	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
