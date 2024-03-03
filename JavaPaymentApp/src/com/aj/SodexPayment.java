package com.aj;

public class SodexPayment implements IPayment {

	@Override
	public boolean processPaymetn(double billAmt) {
		System.out.println("Sodex Card payment processed");
		return true;
	}

}
