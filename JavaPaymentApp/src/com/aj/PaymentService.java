package com.aj;
/*Develop an application to perform bill payment. It should support for multiple payment options debit card, creadit card, sodex, amex etc with loosely coupling
 */
public class PaymentService {
	private IPayment payment;
	
	public PaymentService() {
		
	}
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}//constructor injection
	
	
	public void setPayment(IPayment payment) {
		this.payment =payment;
	}//setter injection
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPaymetn(billAmt);
		if(status) {
			System.out.println("printing receipt");
		}else {
			System.out.println("payment declined");
		}
	}
	

}
