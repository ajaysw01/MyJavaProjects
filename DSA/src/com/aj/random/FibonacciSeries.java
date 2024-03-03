package com.aj.random;

public class FibonacciSeries {
	public static void main(String[] args) {
		int fib = 9;
		System.out.println("fibo of "+ fib + " is as follows ");
		for(int i = 0 ; i< fib; i++) {
			System.out.print(fibRec(i));

		}
	}
	static int fibRec(int count){
		if(count == 0 ) {
			return 0;
		}
		if(count == 1 || count == 2) {
			return 1;
		}
		return fibRec(count - 1) + fibRec(count -2);
	}

}
