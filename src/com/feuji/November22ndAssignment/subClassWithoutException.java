package com.feuji.November22ndAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class superClass5{
	
	void sample() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("sample.txt");
			}
}



public class subClassWithoutException extends superClass  {
	
	void sample()
	{
		
	}
	

} 
