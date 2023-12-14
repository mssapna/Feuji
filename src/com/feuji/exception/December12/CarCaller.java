package com.feuji.exception.December12;

public class CarCaller {
	 public static void performAction(CarAction carAction) {
	        carAction.execute();
	    }

	    public static void main(String[] args) {
	        performAction(Car1::start);
	        performAction(Car1::accelerate);
	    }
}
