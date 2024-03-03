//SelectTest1.java
package com.aj.db;

 import java.sql.DriverManager;
 import java.sql.Connection;
 import java.util.Scanner;
 import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

 /*  java App to get  Emp details based on the given salary range */

public  class SelectTest1
{
	public static void main(String[] args) 
	{
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		ResultSet  rs=null;
		try{
			//read inputs
			sc=new Scanner(System.in);
               float startSalary=0.0f,endSalary=0.0f;

			if(sc!=null){
				System.out.println("Enter start range emp salary");
                  startSalary=sc.nextFloat();
				System.out.println("Enter end range emp salary");
                  endSalary=sc.nextFloat();
			}
			//Load jdbc driver class  (optional)
			  Class.forName("oracle.jdbc.driver.OracleDriver");

			  //establish the connection
                con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			 
			 //create JDBC Statement object
			  if(con!=null)
				  st=con.createStatement();
			  //prepare SQL Query 
			     // select empno,ename,job,sal from emp where sal>=2000 and sal<=10000
			  String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>="+startSalary+" AND SAL<="+endSalary;
			   System.out.println(query);
			  //send execute Query in DB s/w
			   if(st!=null)
			      rs=st.executeQuery(query);
			   //process the ResultSet obj
			    if(rs!=null){
					while(rs.next()==true){
                      System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
                	}//while
			   }//if
		}//try
		catch(SQLException se){  //for known exception
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){  //for known exception
			 cnf.printStackTrace();
		}
		catch(Exception e){  //for unknown exception
		   e.printStackTrace();
		}
     finally{   // good finally block

			try{
              if(rs!=null)
				   rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
    
	       try{
               if(st!=null)
				   st.close();
		   }
		   catch(SQLException se){
			   se.printStackTrace();
		   }

          try{
              if(con!=null)
				   con.close();
		  }
		  catch(SQLException se){
               se.printStackTrace();
		  }
			  try{
			  if(sc!=null)
				  sc.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}//finally

	/*	finally{   //Bad finally block

			try{
              if(rs!=null)
				   rs.close();

               if(st!=null)
				   st.close();

              if(con!=null)
				   con.close();
			  if(sc!=null)
				  sc.close();
			}
			catch(SQLException se){
				 se.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}//finally */

	}//main
}//class
