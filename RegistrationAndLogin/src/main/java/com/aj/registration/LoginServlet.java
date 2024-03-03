package com.aj.registration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail =request.getParameter("email");
		String upwd =request.getParameter("pass");
		String uname = request.getParameter("name");
		HttpSession session =request.getSession();
		RequestDispatcher rd = null;
		
		if(uemail ==null || uemail.equals("")) {
			request.setAttribute("status", "invalidEmail");
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			return;
		}
		if(upwd ==null || upwd.equals("")) {
			request.setAttribute("status", "invalidPass");
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			return;
		}
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","root");
			PreparedStatement pst =con.prepareStatement("SELECT uemail, upwd FROM users WHERE uemail=? AND upwd =?");
			pst.setString(1, uemail);
			pst.setString(2, upwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("name",rs.getString("uname"));
				rd = request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "failed");
				rd =request.getRequestDispatcher("login.jsp");
			}
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
