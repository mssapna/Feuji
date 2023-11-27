package com.feuji.November23rdAssignment;

class Parent5 {
	Parent5() {
		this(10);
		System.out.println("default parent");
	}

	Parent5(int value1) {
		this(10, "job");
		System.out.println("parent: " + value1);
	}

	Parent5(int value2, String string1) {

		System.out.println("parent: " + value2 + " " + string1);
	}
}

public class constructorOverloading {
	public static void main(String[] args) {
		Parent5 parent5 = new Parent5();

	}
}
