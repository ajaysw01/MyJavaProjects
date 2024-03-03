package com.aj.db;

import java.sql.*;

public class ConnTest {
	public static void main(String[] args) throws Exception {

		// step2: Estalish the connection with oracle Db s/w
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		// create STatement object
		Statement st = con.createStatement();
		System.out.println("con object class name ::" + con.getClass());
		System.out.println("st object class name ::" + st.getClass());
		// check the DB Connectivity
		if (con == null)
			System.out.println("Connection is not established");
		else
			System.out.println("Connection is  established");
	}// main
}// class
