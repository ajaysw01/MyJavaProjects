package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.IEmployeeDao;
import com.app.factory.EmpDaoFactory;
import com.app.model.Employee;

public class EmployeeRegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		//1. read input from form data
		String eid = req.getParameter("eid");
		String empName = req.getParameter("ename");
		String empGen = req.getParameter("egen");
		String empAddr = req.getParameter("eaddr");
		
		//2. parse data if required
		int empid=Integer.parseInt(eid);
		
		//3. create model class object
		Employee emp = new Employee();
		
		//4. Store data into model class object
		emp.setEmpid(empid);
		emp.setEmpName(empName);
		emp.setEmpGen(empGen);
		emp.setEmpAddr(empAddr);
		
		//5. create Dao Object using Factory
		IEmployeeDao dao = EmpDaoFactory.getDao();
		
		//6. call insert operation
		int count = dao.insertEmp(emp);
		
		//7. print final message
		PrintWriter pw = resp.getWriter();
		if(count == 1) {
			pw.println("Successfully record created with id "+empid);
		}else {
			pw.print("Check Manually....There are problems");
		}
		
		//8. 
		RequestDispatcher rd = req.getRequestDispatcher("Register.html");
		rd.include(req, resp);
	
		
	}
}
