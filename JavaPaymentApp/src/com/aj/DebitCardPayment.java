package com.aj;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Debit Card payment processed");
		return true;
	}

}
