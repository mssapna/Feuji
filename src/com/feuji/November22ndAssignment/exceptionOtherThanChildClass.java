package com.feuji.November22ndAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class superClass2 {
	void arithmeticException() throws ArithmeticException, FileNotFoundException {
		int value1 = 1 / 0;
		System.out.println(value1);
	}
}

public class exceptionOtherThanChildClass extends superClass2 {

	void arithmeticException() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("text.txt");
	}

	public static void main(String[] args) {

	}
}