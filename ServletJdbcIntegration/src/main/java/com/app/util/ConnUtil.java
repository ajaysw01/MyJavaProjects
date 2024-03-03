package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnUtil {
	private static Connection con = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjdb","root","root");			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//return connection object
	public static Connection getConn() {
		return con;
	}
}
