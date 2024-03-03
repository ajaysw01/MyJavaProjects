import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	private static final long serialVersionUID = 1L;
	private static final String dbDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/chargez";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
	Connection dbCon;
	
	private boolean connectToDtbc()throws SQLException,ClassNotFoundException
	{
	  Class.forName(dbDriver);
	  dbCon = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
	  if(dbCon != null) {
	
		  return true;
	  }
	return false;
	}
	
	public User validateUser(String email, String psw) {
		User user = null;
		try {
			if(connectToDtbc()) {
				String query = "SELECT * FROM user WHERE Email = ? AND Password = ?";
				PreparedStatement stmt = dbCon.prepareStatement(query);
				stmt.setString(1, email);
				stmt.setString(2, psw);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					user = new User();
					user.setEmail(rs.getString(1));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return user;
	}
	
}
