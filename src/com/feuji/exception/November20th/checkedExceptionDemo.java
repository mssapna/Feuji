package com.feuji.exception.November20th;

public class checkedExceptionDemo {

	void arithmeticOperation () 
	{
		int value1=1/0;
		System.out.println(value1);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		checkedExceptionDemo checkedExceptionDemo=new checkedExceptionDemo();
		try {
			checkedExceptionDemo.arithmeticOperation();
		} catch (ArithmeticException e) {
			
			//System.out.println("error"+e.getMessage());
			throw new arithmeticException("error");
		}
		
		
	}
}
