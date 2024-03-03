package com.aj.common;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Logic 1 : Algorithm
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		/*int rev = 0;
		
		while(num != 0) { //1234,123,12,1
			rev = rev *10 + num%10; //4,43,432,4321
			num = num/10; //123,12,1,0
			System.out.println("Reverse is "+rev);

		}
		*/
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		sb.reverse();
//		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		sb1.reverse();
		System.out.println(sb1);
		
		
	}
}
