package com.app.factory;

import com.app.dao.IEmployeeDao;
import com.app.dao.impl.EmployeeDaoImpl;

public class EmpDaoFactory {
	//return POJO object in POJI Casted
	public static IEmployeeDao getDao() {
		return new EmployeeDaoImpl();
	}

}
