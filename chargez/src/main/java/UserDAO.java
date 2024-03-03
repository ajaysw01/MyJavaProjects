import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/chargez";
	String userName ="root";
	String pwd = "root";
	Connection dbCon;

	private boolean connectToDtbc()throws SQLException,ClassNotFoundException
	{
	  Class.forName(dbDriver);
	  dbCon = DriverManager.getConnection(dbURL,userName,pwd);
	  return true;
	  
	}
	  public boolean insertRecord(User userObj)
	  {
		  String insertQueryStr = "Insert into user values(?,?,?,?)";
		  
		  try
		  {
			  if(connectToDtbc())
			  {
				  PreparedStatement ppStmt = dbCon.prepareStatement(insertQueryStr);
				  ppStmt.setString(1,userObj.getFirstname());
				  ppStmt.setString(2,userObj.getLastname());
				  ppStmt.setString(3,userObj.getEmail());
				  ppStmt.setString(4,userObj.getPassword());
				  ppStmt.executeUpdate();
				  ppStmt.close();
				  dbCon.close();
				  return true;
			  }
			  else
				  return false;
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
			  return false;
		  }
	}
}
