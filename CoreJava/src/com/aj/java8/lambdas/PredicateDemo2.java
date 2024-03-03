package com.aj.java8.lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	
	Employee(String name, int sal, int exp)
	{
		ename =name;
		salary =sal;
		experience =exp;
	}
}

public class PredicateDemo2 {
	public static void main(String[] args) {
		//lambda for objects 
		//emp obj as para --> reutnr name of emp if sal>50k emp >3
		Employee emp = new Employee("john", 5000, 5);
		
		
		Predicate<Employee> pr = e->(e.salary>3000 && e.experience>3);
		
		System.out.println(pr.test(emp));
		
		
		// check for multiple objects
				ArrayList< Employee> al = new ArrayList<Employee>();
				al.add(new Employee("Ajay",	20000, 4));
				al.add(new Employee("Akash",2000, 3));
				al.add(new Employee("Akshay",5000, 5));
				al.add(new Employee("Gopal",1000, 1));
				al.add(new Employee("Ganesh",3000, 1));
				
				Predicate< Employee > pr1 = e->(e.salary>3000 && e.experience>2);
				
				for(Employee e : al) {
					if(pr1.test(e)) 
					{
						System.out.println(e.ename + " " + e.salary);
					}
				}
	}

}
