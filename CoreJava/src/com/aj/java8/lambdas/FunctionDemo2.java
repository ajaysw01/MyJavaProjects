package com.aj.java8.lambdas;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String ename;
	int salary;
	
	Student(String name, int sal){
		this.ename = name;
		this.salary = sal;
		
	}
}

public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take std obj based on sal bonus will be given 
		
		ArrayList< Student> stdList = new ArrayList<Student>();
		stdList.add(new Student("Ajay",50000));
		stdList.add(new Student("Akshay",30000));
		stdList.add(new Student("Akash",20000));
		stdList.add(new Student("Gopal",70000));
		
		Function<Student, Integer> fn = e -> {
												int sal = e.salary;
												if(sal>10000 && sal <20000)
													return (sal*10/100);
												else if (sal > 20000 && sal < 50000)
													return (sal * 20/100);
												else
													return (sal * 20/100);
			
												};
												
		Predicate<Integer> p = b-> b>5000;
		
		for(Student std : stdList) {
			int bonus = fn.apply(std);
			p.test(bonus);
			System.out.println(std.ename+"  "+ std.salary);
			System.out.println("Bonus is "+bonus);
		}

	}

}
