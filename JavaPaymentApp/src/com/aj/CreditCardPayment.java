package com.aj;

public class CreditCardPayment implements IPayment{

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Credit Card payment processed");
		return true;
	}

}
