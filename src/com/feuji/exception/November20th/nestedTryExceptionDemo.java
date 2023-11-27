package com.feuji.exception.November20th;

public class nestedTryExceptionDemo {
	
		
void nestedTryDemo()
{
	try {
		
		try {
			int []arrayValue=new int[] {10,20};
			System.out.println(arrayValue[5]);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
		int value1=10/0;
		System.out.println(value1);
		
		
	}
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}

}
public static void main(String[] args) {
	nestedTryExceptionDemo demo=new nestedTryExceptionDemo();
	demo.nestedTryDemo();
}
}
