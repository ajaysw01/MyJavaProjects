package com.aj.oops;


class Outer{
	int a = 10;
	int b = 20;
	void m1() {
		System.out.println("outer method");
	}
	class Inner{
		void m2() {
			System.out.println("inner method");
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i =  o.new Inner();
	}

}
