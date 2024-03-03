package com.aj.java8.lambdas;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = n -> n*n;
		System.out.println(f.apply(10));
		
		
		//string length : ==> integer
		Function<String, Integer> fn = s-> s.length();
		System.out.println(fn.apply("AjuBhai"));

	}

}
