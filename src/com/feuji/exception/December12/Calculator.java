package com.feuji.exception.December12;

public class Calculator {
	 private double result;

	    public void add(double a, double b) {
	        result = a + b;
	    }

	    public void subtract(double a, double b) {
	        result = a - b;
	    }

	    public void multiply(double a, double b) {
	        result = a * b;
	    }

	    public void getResult() {
	        System.out.println("Result: " + result);
	    }
}
