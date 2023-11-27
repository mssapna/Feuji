package com.feuji.exception.November20th;

public class reThrowDemo {
	void reThrow() {
		try {
			int[] arrayValue1 = new int[] { 1, 2, 3, 4 };
			System.out.println(arrayValue1[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		reThrowDemo demo = new reThrowDemo();
		demo.reThrow();
	}
}
