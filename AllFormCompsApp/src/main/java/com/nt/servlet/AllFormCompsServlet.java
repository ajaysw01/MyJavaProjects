//AllFormCompsServlet.java
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class AllFormCompsServlet extends HttpServlet {

	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 //set response content type
		 res.setContentType("text/html");
		 // get PrintWriter 
		 PrintWriter pw=res.getWriter();
		 // read form data
		 String name=req.getParameter("cname");
		 float age=Float.parseFloat(req.getParameter("cage"));
		 String addrs=req.getParameter("cadd");
		 String gender=req.getParameter("gender");
		 String ms=req.getParameter("ms");
		 if(ms==null) {
			 ms="single";  //handling non-checked state for checkbox
		 }
		 
		 String qlfy=req.getParameter("qlfy");
		 if(qlfy==null)
			   qlfy="no qualification is selected";  //handling non-selected state for select box
		 String hobies[]=req.getParameterValues("hb");
		 
		 if(hobies==null)
			 hobies=new String[] {" No hobies are selected"};  // handling non-checked state for  multiple check boxes
		 
		 String favCousins[]=req.getParameterValues("favCousine");
		  if(favCousins==null)
			    favCousins=new String[] {" No favoirite cousins are selected"};  // handling non-selected state for  List box
		 
		 int luckyNo=Integer.parseInt(req.getParameter("luckyNo"));
		 String favColor=req.getParameter("favColor");
		 int  salary=Integer.parseInt(req.getParameter("salary"));
		 String email=req.getParameter("mail");
		 String dob=req.getParameter("dob");
		 String tob=req.getParameter("tob");
		 String doj=req.getParameter("doj");
		 String  emonth=req.getParameter("eMonth");
		 String  favWeek=req.getParameter("favWeek");
          long mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		 String fbUrl=req.getParameter("fbUrl");
		 String  ss=req.getParameter("sString");
		 
		 //write  b.logic
		 if(gender.equalsIgnoreCase("M")) {
			  if(age<5)
				    pw.println("<h1>Master."+name+" u r baby boy </h1>");
			  else if(age<=12)
				  pw.println("<h1>Master."+name+" u r small boy </h1>");
			  else if(age<=19)
				  pw.println("<h1>Mr."+name+" u r teenage boy </h1>");
			  else if(age<=35)
				  pw.println("<h1>Mr."+name+" u r young man </h1>");
			  else if(age<=50)
				  pw.println("<h1>Mr."+name+" u r middle-aged man </h1>");
			  else
				  pw.println("<h1>Mr."+name+" u r  budda </h1>");
		 }
		 else {
			 if(age<5)
				    pw.println("<h1>Master."+name+" u r baby girl </h1>");
			  else if(age<=12)
				  pw.println("<h1>Master."+name+" u r small girl </h1>");
			  else if(age<=19) {
				   if(ms.equalsIgnoreCase("married"))
					   pw.println("<h1>Mrs."+name+" u r teenage married girl </h1>");
				   else
					   pw.println("<h1>Miss."+name+" u r teenage  girl </h1>");
			  }
			  else if(age<=35) {
				   if(ms.equalsIgnoreCase("married"))
					   pw.println("<h1>Mrs."+name+" u r young married woman </h1>");
				   else
					   pw.println("<h1>Miss."+name+" u r  young  woman </h1>");
			  }
			  else if(age<=50) {
				   if(ms.equalsIgnoreCase("married"))
					   pw.println("<h1>Mrs."+name+" u r  married middle aged woman </h1>");
				   else
					   pw.println("<h1>Miss."+name+" u r middle aged woman </h1>");
			  }
			  else {
				  if(ms.equalsIgnoreCase("married"))
					   pw.println("<h1>Mrs."+name+" u r  married  buddi </h1>");
				   else
					   pw.println("<h1>Miss."+name+" u r  buddi </h1>");
			    }
		 }//else
			  
			 //display form form data
			 pw.println("<h1> form data  is </h1>");
			 pw.println("<b> name :: "+name+"</b><br>");
			 pw.println("<b> age :: "+age+"</b><br>");
			 pw.println("<b> address :: "+addrs+"</b><br>");
			 pw.println("<b> gender:: "+gender+"</b><br>");
			 pw.println("<b>  Marital Status:: "+ms+"</b><br>");
			 pw.println("<b>  MobileNo :: "+mobileNo+"</b><br>");
			 pw.println("<b> Qualification :: "+qlfy+"</b><br>");
			 pw.println("<b> Hobies :: "+Arrays.asList(hobies)+"</b><br>");
			 pw.println("<b> Fav Cousins :: "+Arrays.asList(favCousins)+"</b><br>");
			 pw.println("<b> DOB :: "+dob+"</b><br>");
			 pw.println("<b> TOB :: "+tob+"</b><br>");
			 pw.println("<b> DOJ :: "+doj+"</b><br>");
			 pw.println("<b>  Alegritic Month :: "+emonth+"</b><br>");
			 pw.println("<b>  Fav week day :: "+favWeek+"</b><br>");
			 pw.println("<b>  Fav color :: "+favColor+"</b><br>");
			 pw.println("<b>  Email :: "+email+"</b><br>");
			 pw.println("<b>  fburl :: "+fbUrl+"</b><br>");
			 pw.println("<b>  Google Search String :: "+ss+"</b><br>");
			 
			 //add home hyperlink
			 pw.println("<br><br><a href='all_form_register.html'>home</a>");
			 
			 
			 
			 
			 
			 
		 }//doGet(-,-)
		 
		 
	
	
	
	@Override
	public void  doPost(HttpServletRequest  req, HttpServletResponse res)throws ServletException,IOException{
	     doGet(req,res);	
	}
}
