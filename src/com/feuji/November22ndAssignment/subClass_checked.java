package com.feuji.November22ndAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class superClass{
	
//	void sample()
//	{
//		
//	}
}



public class subClass_checked extends superClass  {
	void sample() throws FileNotFoundException {
FileInputStream fileInputStream=new FileInputStream("sample.txt");
	}
	
public static void main(String[] args) {
	subClass_checked class1=new subClass_checked();
	//class1.demo();
}

} 
