package com.feuji.exception.November21th;

class grandParent {
	int value1 = 20;
	double value2 = 9927398.8;

	void arithmeticOperation() {
		double result = value1 + 90 * 73893249 % 5 + 67;
		System.out.println(result);
	}
}

class Parent extends grandParent {
	void booleanOperations() {
		boolean flag = true;
		if (10 > 9) {
			System.out.println(flag);
		}
	}
}

public class multiLevelInheritance extends Parent {
	public static void main(String[] args) {
		multiLevelInheritance grandson = new multiLevelInheritance();
		grandson.arithmeticOperation();
		grandson.booleanOperations();
	}
}
