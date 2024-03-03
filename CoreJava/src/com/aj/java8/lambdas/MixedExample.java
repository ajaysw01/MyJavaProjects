package com.aj.java8.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Empl{
	String ename;
	int salary;
	String gender;
	
	Empl(String name, int sal,String gender){
		this.ename = name;
		this.salary = sal;
		this.gender= gender;
	}
	
}

//calculate bous
//verify bonus >5000
//print emp details

public class MixedExample {
	public static void main(String[] args) {
		ArrayList<Empl> emplist = new ArrayList<Empl>();
		emplist.add(new Empl("Ajau",50000, "male"));
		emplist.add(new Empl("Akash",3000, "female"));
		emplist.add(new Empl("akshay",10000, "male"));
		
		//Function calculate bonus
		Function<Empl,Integer> fn = emp -> (emp.salary*10)/100;
		
		//task 2
		Predicate<Integer> p =b -> (b>=5000);
		
		//consumer
		Consumer<Empl> c = emp->{
								System.out.println(emp.ename);
								System.out.println(emp.salary);
								System.out.println(emp.gender);
		
								};
								
		for(Empl e : emplist) {
			int bonus = fn.apply(e);
			if(p.test(bonus)) {
				c.accept(e);
				System.out.println(bonus);
			}
		}
								
	}
		
}