//EmployeeDBServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/empdburl")
public class EmployeeDBServlet extends HttpServlet {
	private static final String  GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  //set response content type
		  res.setContentType("text/html");
		  
		  //get Access to ServletContext object
		  ServletContext sc=getServletContext();
		  //read init param values
		  String driver=sc.getInitParameter("driver");
		  String url=sc.getInitParameter("jdbcurl");
		  String user=sc.getInitParameter("dbuser");
		  String pass=sc.getInitParameter("dbpwd");
		  
		  //  Load jdbc driver class
		  try {
			  Class.forName(driver);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
		try(PrintWriter pw=res.getWriter();
				Connection  con=DriverManager.getConnection(url, user,pass);
				PreparedStatement ps=con.prepareStatement(GET_EMP_DETAILS_BY_NO);
				){
			//read form data
			int no=Integer.parseInt(req.getParameter("eno"));
			//set value to query param (?)
			ps.setInt(1, no);
			//execute the pre-compiled SQL Query
			try(ResultSet rs=ps.executeQuery()){
				 //process the  ResultSet obj
				if(rs.next()) {
					pw.println("<table border='1' align='center'>");
					pw.println("<tr><th> empno</th> <th> ename</th> <th>job </th> <th>salary </th> <th> deptno</th> </tr>");
					pw.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getFloat(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");
					pw.println("</table>");
				}
				else {
					pw.println("<h1 style='color:red;text-align:center'> Employee not found </h1>");
				}
				
				//add home hyperlink
				pw.println("<h1 style='color:red;text-align:center'><a href='input.html'>home </a></h1>");
				
				ServletContext sc1=getServletContext();
				pw.println("<br> dbuser context param value ::"+sc1.getInitParameter("dbuser"));
				
				ServletConfig  cg=getServletConfig();
				pw.println("<br> dbuser init param value ::"+cg.getInitParameter("dbuser"));
				
				
				
				
			}//try2
		}//try1
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//doGet(-,-)

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}//doPost(-,-)

}//class
