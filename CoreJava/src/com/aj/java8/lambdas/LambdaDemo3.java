package com.aj.java8.lambdas;

import java.util.function.Predicate;



public class LambdaDemo3 {
	public static void main(String[] args) {
		
		//How to join multiple Predicates >> two methods and, or, negate
		//p1 : checks number is even
		//p2  : checks number greater that 50 or not
		
		int[] arr = {5,15,20,25,30,35,60,65};
		
		Predicate<Integer> p1 = i->i%2==0;
		
		Predicate<Integer> p2 = i->i>50;
		
		//and
		System.out.println("numbers > 50 and are even ");
		for(int n : arr) {
			if(p1.test(n) && p2.test(n)) 
			//or  p1.and(p2).test(n)
			{
				System.out.println(n);
			}
		}
		
		
		//or 
		System.out.println("Either even or > 50");
		for(int n : arr) {
			if(p1.or(p2).test(n)) {
				System.out.println(n);
			}
		}
		
		//negate
		System.out.println("odd no ares ");
		for(int n : arr) {
			if(p1.negate().test(n)) {
				System.out.println(n);
			}
		}
		
		

	}

}
