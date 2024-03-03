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
 * Servlet implementation class First
 */

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//getting printwriter object pointing towards res obj
		PrintWriter pw = resp.getWriter();
		//set resp content type
		resp.setContentType("text/html");
		//reading parameters from the form
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		String name = req.getParameter("name");
		String course =req.getParameter("course");
		
		//creating hhtpsession object 
		HttpSession session  = req.getSession(true);
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("course", course);
		if(course.equalsIgnoreCase("mca")) {
			pw.println("<form action='second' method='post'>");
			pw.print("<h1>Welcome Candidate to MCA</h2>");
			pw.println("Year : <input type='text' name = 'year' >");
			pw.println("<input type='submit' value='submit'> ");
			pw.println("</form>");

		}else {
			pw.println("<form action='second' method='post'>");
			pw.print("<h1>Welcome Candidate to College</h2>");
			pw.println("Year : <input type='text' name = 'year' >");
			pw.println("<input type='submit' value='submit'> ");
			pw.println("</form>");
		}
		
		pw.close();

			
	}
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			doPost(req, resp);
		}

}
