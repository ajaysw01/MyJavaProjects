package com.aj.pattern;

import java.util.Scanner;
//11111
//22222
//33333
//44444
//55555

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int r =1; r<=n; r++) {
			for(int c = 1; c<=n ; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
