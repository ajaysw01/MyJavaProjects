package com.aj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/second")
public class Second extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		String year = req.getParameter("year");
		
		Cookie cookie[] = req.getCookies();
		int id = 0;
		String name = null;
		if(cookie!=null) {
			 id=Integer.parseInt(cookie[0].getValue());
			 name=cookie[1].getValue();
		 }
		
		pw.println("<h1>Hello "+id+":"+name+"from "+year+"</h1>");
		
		
		 // here we can write jdbc  code to insert both forms data as record in db table

		 
		 //add home hyperlink
		  pw.println("<br> <a href='index.jsp'>home </a>");
		 pw.close();

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
