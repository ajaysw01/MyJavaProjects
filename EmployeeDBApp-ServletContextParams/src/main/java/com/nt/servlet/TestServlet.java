//TestServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {

	/*
	 * public TestServlet() { ServletConfig cg=getServletConfig(); ServletContext
	 * sc=getServletContext(); System.out.println("from constructor::"+
	 * sc.getInitParameter("dbuser")); }
	 */
	
	public void init() {
		 ServletConfig cg=getServletConfig();
		 ServletContext sc=getServletContext();
		 System.out.println("fromt init method:"+sc.getInitParameter("dbuser"));
		 
		
	}


	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		// get Access to SeervletContext object
		ServletContext sc=getServletContext();
		// information using ServletContext obj
		pw.println("<br><b> Sever info ::"+sc.getServerInfo()+"</b>");
		pw.println("<br><b> servlet api version ::"+sc.getMajorVersion()+"."+sc.getMinorVersion()+"</b>");
		pw.println("<br> <b> MIME type of input.html file ::"+sc.getMimeType("input.html")+"</b>");
		pw.println("<br> <b> Path of   input.html file ::"+sc.getRealPath("/input.html")+"</b>");
		pw.println("<br> <b> Path of   web application's context path ::"+sc.getRealPath("/")+"</b>");
		pw.println("<br> <b>Context path of the webapplication:::"+sc.getContextPath()+"</b>");
	     InputStream is=sc.getResourceAsStream("/input.html");
	     int k=0;
	     while( (k=is.read())!=-1) {
	    	 pw.print(((char)k));
	     }
		
		Map<String, ? extends ServletRegistration> map=sc.getServletRegistrations();
		pw.println("<br><b> all the registered servlet comps are"+map.toString()+"</b>");
		
		
	
		
		
		
		//close stream
		pw.close();
	
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
