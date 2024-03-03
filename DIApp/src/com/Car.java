package com;
public class Car{
	
	private IEngine eng;
	public Car() {
		this.eng = eng;
	}
	
	
	public void drive() {
		eng.start();
		System.out.println("Journery Started....");
	}

}
