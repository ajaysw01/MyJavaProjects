package com.aj.pattern;

import java.util.Scanner;

//1
//12
//123
//1234
//12345

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int r =1; r<=n; r++) {
			for(int c = 1; c<=r ; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
