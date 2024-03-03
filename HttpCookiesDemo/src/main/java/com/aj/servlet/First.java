package com.aj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class First extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//getting printwriter object pointing towards res obj
	PrintWriter pw = resp.getWriter();
	//set resp content type
	resp.setContentType("text/html");
	//reading parameters from the form
	String sid = req.getParameter("id");
	int id = Integer.parseInt(sid);
	String name = req.getParameter("name");
	String course =req.getParameter("course");
	
	//httpcookies 
	Cookie ck1 = new Cookie("id", String.valueOf(id));
	Cookie ck2 = new Cookie("name", name);
	resp.addCookie(ck1);
	resp.addCookie(ck2);
	
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
