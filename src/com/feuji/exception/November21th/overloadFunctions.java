package com.feuji.exception.November21th;

public class overloadFunctions {
	void add() {
		System.out.println("I'm non parametrized method");
	}

	void add(int a) {
		System.out.println("i'm of int type and my value is: " + a);
	}

	void add(int a, String b) {
		System.out.println("we are int and string type: " + a + b);
	}

	public static void main(String[] args) {
		overloadFunctions functions = new overloadFunctions();
		functions.add();
		functions.add(1);
		functions.add(3, "sapna");
	}

}
