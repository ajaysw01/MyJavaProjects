import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OwnerDAO {
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/chargez";
	String userName ="root";
	String pwd = "root";
	Connection dbCon;

	private boolean connectToDtbc()throws SQLException,ClassNotFoundException
	{
	  Class.forName(dbDriver);
	  dbCon = DriverManager.getConnection(dbURL,userName,pwd);
	  System.out.println("connect to database");
	  return true;
	  
	}
	  public boolean insertRecord(Owner ownerObj)
	  {
		  String insertQueryStr = "Insert into owner values(?,?,?,?,?,?,?,?,?,?,?)";
		  System.out.println("connect to table");
		  try
		  {
			  if(connectToDtbc())
			  {
				  PreparedStatement ppStmt = dbCon.prepareStatement(insertQueryStr);
				  ppStmt.setString(1,ownerObj.getChargingPoint());
				  ppStmt.setString(2,ownerObj.getOwnerName());
				  ppStmt.setString(3,ownerObj.getEmail());
				  ppStmt.setString(4,ownerObj.getContactNo());
				  ppStmt.setString(5,ownerObj.getAddress());
				  ppStmt.setInt(6,ownerObj.getPincode());
				  ppStmt.setString(7,ownerObj.getChargerType());
				  ppStmt.setString(8,ownerObj.getTiming());
				  ppStmt.setInt(9,ownerObj.getCost());
				  ppStmt.setString(10,ownerObj.getPassword());
				  ppStmt.setString(11,ownerObj.getFacility());
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
