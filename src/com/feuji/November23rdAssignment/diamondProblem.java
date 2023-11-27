package com.feuji.November23rdAssignment;

class Parent1 {
	void pattern() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class children1 extends Parent1 {
	void pattern() {
		int value1 = 56;
		int value2 = 90;
		System.out.println("the result is:" + value1 + value2 * 387);
	}
}

class children2 extends Parent1 {
	void pattern() {
		int n = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " *" + i + "=" + n * i);
		}
	}
}

//class grandChildren extends children1,children2{
//	
//}

public class diamondProblem {
	public static void main(String[] args) {

	}
}
