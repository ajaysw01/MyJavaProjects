import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServelet")
public class UserServelet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public UserServelet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		User userObj = new User();
		userObj.setFirstname(request.getParameter("Firstname"));
		userObj.setLastname(request.getParameter("Lastname"));
		userObj.setEmail(request.getParameter("Email"));
		userObj.setPassword(request.getParameter("password"));
		UserDAO userDAOObj = new UserDAO();
		if(userDAOObj.insertRecord(userObj))
		{
			response.sendRedirect("login_user.html");
		}
		else
		{
			response.sendRedirect("Retry.html");
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
