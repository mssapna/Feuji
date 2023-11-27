package com.feuji.November22ndAssignment;

class superClass6
{


void arithmeticException() throws ArithmeticException
{
	int value1=1/0;
	System.out.println(value1);
}
}


public class subClasssChildException extends superClass6 {
	
	void arithmeticException () throws NullPointerException
	{
		//super.arithmeticException();
		int [] value1= null;
		System.out.println(value1.length);
	}
	public static void main(String[] args) {
		
	
	subClasssChildException childException=new subClasssChildException();
	childException.arithmeticException();
}
}