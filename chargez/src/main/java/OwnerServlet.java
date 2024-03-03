import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/OwnerServlet")
public class OwnerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public OwnerServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Owner ownerObj = new Owner();
		ownerObj.setChargingPoint(request.getParameter("chargingpoint"));
		ownerObj.setOwnerName(request.getParameter("name"));
		ownerObj.setEmail(request.getParameter("email"));
		ownerObj.setContactNo(request.getParameter("Cno"));
		ownerObj.setAddress(request.getParameter("addr"));
		ownerObj.setPincode(Integer.parseInt(request.getParameter("pincode")));
		ownerObj.setChargerType(request.getParameter("cType"));
		ownerObj.setTiming(request.getParameter("inTime"));
		ownerObj.setCost(Integer.parseInt(request.getParameter("cost")));
		ownerObj.setPassword(request.getParameter("password"));
		ownerObj.setFacility(request.getParameter("facility"));

		OwnerDAO ownerDAOObj = new OwnerDAO();
		if(ownerDAOObj.insertRecord(ownerObj))
		{
			response.sendRedirect("index.html");
		}
		else
		{
			response.sendRedirect("Retry.html");
			
		}
		
		response.getWriter().append("Served at: index.html").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
