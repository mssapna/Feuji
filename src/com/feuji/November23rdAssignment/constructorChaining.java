package com.feuji.November23rdAssignment;

class Parent {
	Parent() {
		this(10);
		System.out.println("default parent");
	}

	Parent(int value1) {
		this(10, "job");
		System.out.println("parent: " + value1);
	}

	Parent(int value2, String string1) {

		System.out.println("parent: " + value2 + " " + string1);
	}
}

class child extends Parent {
	child() {
		super(10, "p");
		System.out.println("default childs");
	}
}

public class constructorChaining {
	public static void main(String[] args) {
		child child = new child();

	}
}
