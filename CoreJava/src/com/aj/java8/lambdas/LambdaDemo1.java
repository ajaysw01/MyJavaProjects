package com.aj.java8.lambdas;

@FunctionalInterface
interface bike{
	public void book(String src,String dest);

}

public class LambdaDemo1 {
	public static void main(String[] args) {
		bike bike = (src, dest)->System.out.println("Hello ajay");
		bike.book("akl", "hyd");
		
	}

}
