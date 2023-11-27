package com.feuji.exception.November21th;

class child4 {
	void rehersal() {
		System.out.println("we are performing demo in parent class");
	}
}

public class differentObject extends child4 {
	void rehersal() {
		System.out.println("we are performing rehersal in child class");
	}

	public static void main(String[] args) {
		child4 child4 = new child4();
		child4.rehersal();
		differentObject differentObject = new differentObject();
		differentObject.rehersal();
	}
}
