import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServelet")
public class OwnerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public OwnerLoginServlet() 
	{
		super();
	}
	private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/chargez";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
	Connection dbCon;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		OwnerLoginDAO dao = new OwnerLoginDAO();
		Owner owner = dao.validateOwner(Email, Password);
		if(owner!= null) {
			session.setAttribute("current-owner",owner);
			response.sendRedirect("index.html");
		}else {
			response.sendRedirect("Retry.html");
			
		}		
		response.getWriter().append("Served at: register_owner.html").append(request.getContextPath());

	}
	
}