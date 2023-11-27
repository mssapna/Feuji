package com.feuji.November22ndAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class superClass1{
	void arithmeticException () 
	{
		
	}
}



public class subClass_unchecked extends superClass  {
	void arithmeticException () throws ArithmeticException
	{
		int value1=1/0;
		System.out.println(value1);
	}
	
public static void main(String[] args) {
	subClass_unchecked class1=new subClass_unchecked();
	//class1.demo();
}

} 
