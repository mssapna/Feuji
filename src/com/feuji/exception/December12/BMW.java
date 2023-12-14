package com.feuji.exception.December12;

public class BMW {
	public void drive1() {
		System.out.println("This is driving Method");
	}
	
	public static void main(String[] args) {
		/*
		 * BMW bmw=new BMW(); Car car=bmw::drive1; car.drive();
		 */
		Car car=()->System.out.println("This is drive method");
		car.drive();
	}
}

	interface Car{
		void drive();
	}
	
		
