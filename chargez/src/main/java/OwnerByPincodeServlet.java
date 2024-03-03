import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.sql.*;
@WebServlet("/OwnerByPincodeServlet")
public class OwnerByPincodeServlet extends HttpServlet {
    
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        // Get the Pincode parameter from the request
        String pincode = request.getParameter("pincode");
        
        // Set up the database connection
        String dbUrl = "jdbc:mysql://localhost:3306/chargez";
        String dbUser = "root";
        String dbPass = "root";
        
        try {
            // Load the JDBC driver and establish a connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            
            // Prepare the SQL query
            String sql = "SELECT * FROM owner WHERE Pincode = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pincode);
            
            // Execute the query and get the results
            ResultSet resultSet = statement.executeQuery();
            
            // Generate HTML output
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Charging Stations in your Area :</title>"
            		+"<style>\r\n"
            		+ "table,th,td {\r\n"
            		+ "  border: 1px solid;\r\n"
            		+ "  background-color: white;\r\n"
            		+ "  padding: 10px 10px 10px 10px;\r\n "
            		+ "  width: 90%\r\n"
            		+ "  height: 100% \r\n"
            		+ "}\r\n"
            		+ "  body{\r\n"
            		+ "  background-color: #d5f8e3;"
            		+ "}"
            		+ "</style>"
            		
            		+ "</head><body >");
            out.println("<h1>Charging Stations in your Area :</h1>");
            out.println("<table border = 1 ><thead><tr><th>Charging Point</th><th>Owner Name</th><th>Email</th><th>Contact No</th><th>Address</th><th>Pincode</th><th>Charger Type</th><th>Timing</th><th>Cost</th><th>Facility</th></tr></thead>");
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getString("CharginPoint") + "</td>");
                out.println("<td>" + resultSet.getString("OwnerName") + "</td>");
                out.println("<td>" + resultSet.getString("Email") + "</td>");
                out.println("<td>" + resultSet.getString("ContactNo") + "</td>");
                out.println("<td>" + resultSet.getString("Address") + "</td>");
                out.println("<td>" + resultSet.getString("Pincode") + "</td>");
                out.println("<td>" + resultSet.getString("ChargerType") + "</td>");
                out.println("<td>" + resultSet.getString("Timing") + "</td>");
                out.println("<td>" + resultSet.getString("Cost") + "</td>");
                out.println("<td>" + resultSet.getString("Facility") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
            
            // Clean up
            resultSet.close();
            statement.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
