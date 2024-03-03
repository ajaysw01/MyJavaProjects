//SelectTest.java
package com.aj.db;

import java.sql.*;
public class  SelectTest
{
	public static void main(String[] args) throws Exception
	{
		  // JDBC code (Persistence logic)
		// Load jdbc driver class  (optional -becoz of AutoLoading jdbc driver class -jdbc4 feature)
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		//create Jdbc Statement object
		 Statement st=con.createStatement();
		 //send and execute SQL Query in Db s/w
		 ResultSet rs=st.executeQuery("SELECT  *  FROM STUDENT");
		 //process the ResultSet obj
		 while(rs.next()!=false){
		    //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getFloat(4));
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getString(4));
			System.out.println(rs.getInt("sno")+"  "+rs.getString("sname")+"  "+rs.getString("sadd")+"   "+rs.getFloat("avg"));
		 }//while
		 //close jdbc objs
		 rs.close();
		 st.close();
		 con.close();
	
	}//main
}//class
