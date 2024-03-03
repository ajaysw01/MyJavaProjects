//StudentRegistrationServlet
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/poolurl")
public class StudentRegistrationServlet  extends  HttpServlet{
	private static final String  INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(SNO_SEQ1.NEXTVAL,?,?,?)";
	
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		 //set response content type
		 res.setContentType("text/html");
		 // read form data
		 String name=req.getParameter("sname");
		 String addrs=req.getParameter("sadd");
		 float avg=Float.parseFloat(req.getParameter("avg"));
		 try( PrintWriter pw=res.getWriter();
				 Connection con=getPooledJdbcConnection();
				 PreparedStatement ps=con.prepareStatement(INSERT_STUDENT_QUERY)){
			   if(ps!=null) {
				   //set values to query params
				   ps.setString(1, name);
				   ps.setString(2, addrs);
				   ps.setFloat(3,avg);
				   
				   //execute the SQL Query
				   int count=ps.executeUpdate();
				   
				   //process the results
				   if(count==0)
					    pw.println("<h1 style='color:red;text-align:center'> Student registration failed </h1>");
				   else
					   pw.println("<h1 style='color:green;text-align:center'> Student registration succedded </h1>");
			   }
			   
			   
			   //add home hyperlink
				  pw.println("<br><br> <a href='input.html'>home</a>");
			 
		 }
		 catch(SQLException se) {
			 se.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		
		
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	 //private methods are hepler methods which will be used with in the class
	private   Connection  getPooledJdbcConnection() throws Exception{
		     // establish the connection with Jndi registry
		      InitialContext  ic=new InitialContext();
		      // Perform lookup operation and get  DataSource object ref
		      DataSource ds=(DataSource) ic.lookup("OracleDS");
		      //DataSource ds=(DataSource) ic.lookup("java://comp/env/DsJndi");
		      //get Pooled Jdbc con object
		      Connection con=ds.getConnection();
		      return con;
		
	}

}
