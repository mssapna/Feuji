package com.feuji.exception.November20th;

public class userExceptionFromTryBlock {
 void arithmeticExceptionDemo() throws Exception
 {
	 int value1=10/0;
	 System.out.println(value1);
	 }
 public static void main(String[] args) throws arithmeticException {
	userExceptionFromTryBlock block=new userExceptionFromTryBlock();
	try {
	//	System.out.println("hello");
	//block.arithmeticExceptionDemo();
//		
		throw new arithmeticException("you have occured an error");
		
	
	
	} catch (arithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("handled");
		System.err.println(e.getMessage());
		
	}
}
}
