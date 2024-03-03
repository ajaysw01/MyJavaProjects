package com.aj.java8.lambdas;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		// get()
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
	}

}
