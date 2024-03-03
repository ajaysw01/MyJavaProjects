package com.aj.java8.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer{
	int custId;
	String custName;
	int custAge;
	public Customer(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}
	
}

public class FilterMapDemo {
	public static void main(String[] args) {
	/*	List<Customer> customer =  new ArrayList<Customer>();
		customer.add(new Customer(11,"ajay",50));
		customer.add(new Customer(13,"akshay",20));
		customer.add(new Customer(31,"akash",25));
		customer.add(new Customer(50,"gopal",35));
		
		*/
		
		List<Customer> custList = Arrays.asList(
				new Customer(11,"ajay",50),
				new Customer(13,"akshay",20),
				new Customer(31,"akash",25),
				new Customer(50,"gopal",35)
				);
		
		//combining filter nad amp
		
		List<Integer> ageList =
		custList.stream().
		filter(c -> c.custAge>35)
		.map(c-> c.custAge)
		.collect(Collectors.toList());	
		
		
		System.out.println(ageList);

	}
	
	

	

}
