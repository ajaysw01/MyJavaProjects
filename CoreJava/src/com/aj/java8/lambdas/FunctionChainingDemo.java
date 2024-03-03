package com.aj.java8.lambdas;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		//we can achieve function chainging by 2 methods
		
		//andThen
		//compose
		Function<Integer, Integer> f1 = n -> n*2;
		Function<Integer, Integer> f2 = n-> n*n*n;
		
		//addThen()
		System.out.println(f1.andThen(f2).apply(2)); // first f1 and then f2 
		
		//compose()
		System.out.println(f1.compose(f2).apply(2)); // first f2 : 2*2*2 = 8 => F1 **2 => 16
	}
}
