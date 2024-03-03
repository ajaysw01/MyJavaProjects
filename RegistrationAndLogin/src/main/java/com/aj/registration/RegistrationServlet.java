package com.aj.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String repwd = request.getParameter("re-pass");
		String ucontact = request.getParameter("contact");
//		HttpSession session =request.getSession();
		RequestDispatcher rd =null;
		
		if(uname ==null || uname.equals("")) {
			request.setAttribute("status", "invalidName");
			
		}
		if(uemail ==null || uemail.equals("")) {
			request.setAttribute("status", "invalidEmail");
			
		}
		if(upwd ==null || upwd.equals("")) {
			request.setAttribute("status", "invalidPass");
			
		}else if(!upwd.equals(repwd)){
			request.setAttribute("status", "invalidConfirmPass");
			 
			
		}
		if(ucontact ==null || ucontact.equals("")) {
			request.setAttribute("status", "invalidContact");
			
		}else if(ucontact.length() > 10) {
			request.setAttribute("status", "invalidContactLength");
			
		}else {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","root");
				PreparedStatement pst =con.prepareStatement("insert into users(uname,uemail,upwd,ucontact) values(?,?,?,?)");
				pst.setString(1, uname);
				pst.setString(2, uemail);
				pst.setString(3, upwd);
				pst.setString(4, ucontact);
				int rowCount = pst.executeUpdate();
				
				if(rowCount>0) {
					request.setAttribute("status","success");
					rd = request.getRequestDispatcher("registration.jsp");

				}else {
					request.setAttribute("status","failed");

				}
				rd.forward(request, response); 
				 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		rd = request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
		 		
		
	}

}
