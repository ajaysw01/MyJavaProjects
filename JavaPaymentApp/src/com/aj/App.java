package com.aj;

public class App {
	public static void main(String[] args) {
		IPayment p1 = new DebitCardPayment();
		IPayment p2 = new CreditCardPayment();
		
		//constructor injection
		PaymentService ps = new PaymentService(p1);
		
		//setter injection
		ps.setPayment(p2);
		ps.doPayment(450.00);//setter injection will override the constructor inejction value
		
	}

}
