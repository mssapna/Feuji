package com.feuji.exception.November21th;

class child1 {
	void add() {
		int value1 = 10;
		int value2 = 20;
		System.out.println("the result is:" + (value1 * 100 + (value2 / value1)));
	}
}

public class isARelationshipDemo extends child1 {
	public static void main(String[] args) {
		isARelationshipDemo aRelationshipDemo = new isARelationshipDemo();
		aRelationshipDemo.add();
	}

}
