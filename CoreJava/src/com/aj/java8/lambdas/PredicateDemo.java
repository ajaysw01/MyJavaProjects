package com.aj.java8.lambdas;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer>  p = i -> (i>10);
		System.out.println(p.test(20));//true
		System.out.println(p.test(4));//false
		
		
		//Q. Check the length of string is greater than 4 or not
		
		Predicate<String> pr = s->(s.length()>4);
		System.out.println(pr.test("Ajau"));//false
		
		System.out.println(pr.test("lets nacho"));
		
		//QPrint array elements whose size is >4 from array
		String names[] = {"Ajay","peter","hermoine","ronald","harry"};
		
		for(String name : names) {
			/*if(pr.test(name)) {
				System.out.println(name);
			}*/
			if(name.length()>4) {// 10 condtions, for each iterations 10 conds are verified
				System.out.println(name);
			}
		}//for
		
		
		}
	}

