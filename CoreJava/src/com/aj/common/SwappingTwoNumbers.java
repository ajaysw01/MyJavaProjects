package com.aj.common;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b =20;
		
		//Logic 1
		/*
		 * int temp = a; a = b; b = temp; System.out.println(a); System.out.println(b);
		 */
		
		//logic 2
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println(a); 
//		System.out.println(b);
		
		
		//logic 3 
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a);
		System.out.println(b);
	}

}
