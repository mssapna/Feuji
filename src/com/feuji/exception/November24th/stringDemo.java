package com.feuji.exception.November24th;

import java.util.Arrays;

class demoOfStringOperations{
	
	//Convert string characters to char array and then display them
	void stringOperations()
	{
		String sName="sapna";
		char[] sReNamed=sName.toCharArray();
		for(int i=sReNamed.length-1;i>=0;i--)
		{
		System.out.println(sReNamed[i]);
	}
}
	
	//Substring "CoreNuts Technologies" from "CoreNuts Technologies Pvt lTD"
	void substringDemo()
	{
		String sName="CoreNuts Technologies Pvt Ltd";
		String subName=sName.substring(0, 21);
		System.out.println(subName);
	
	}
	
	//compare address of string objects//string values
	
	void compareAddress()
	{
		String value1="hiji&78";
		//String value2="byeji&89";
		//String value2=value1;
		//System.out.println(value1==value2);
		
		String value3=new String("bangalore");
		String value4=new String("bangalore");
		//System.out.println(value3==value4);
		System.out.println(value3.equals(value4));
	}
	
	//Reverse a string
	
	void reverseStringDemo(){
		String s1="CoreNuts Technologies Pvt lTd";
		String reverse=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);
	}
	
	void reverseStringDemo2(){
		String sName="CoreNuts Technologies Pvt lTd";
		char[] sReNamed=sName.toCharArray();
		for(int i=sReNamed.length-1;i>=0;i--)
		{
		System.out.println(sReNamed[i]);
	}
	}
	
	//ReverseWOrds
	void reverseWords(){
		String sName="";
		String[] sReverse=sName.split(" ");
		//System.out.println(Arrays.toString(sReverse));
		for(int i=sReverse.length-1;i>=0;i--)
		{
			System.out.println(sReverse[i]);
		}
		
	}
	
	//Tokinized string
	void tokenizedString()
	{
		String companyName="CoreNuts Technologies Pvt lTd";
		String[] tokenwise=companyName.split(" ");
		System.out.println("Tokens:");
		System.out.println(Arrays.toString(tokenwise));
	}
	
	//BufferDelete
	void bufferDelete()
	{
		StringBuffer buffer=new StringBuffer("CoreNuts Technologies Pvt lTd");
		System.out.println(buffer.delete(9, 21));
		
	}
	
	//insert string
	void insertString()
	{
		StringBuffer buffer=new StringBuffer("CoreNuts Pvt lTd");
			
	}
	
	
}



public class stringDemo {
public static void main(String[] args) {
	demoOfStringOperations demoOfStringOperations=new demoOfStringOperations();
	//demoOfStringOperations.stringOperations();
//	demoOfStringOperations.substringDemo();
//	demoOfStringOperations.compareAddress();
//	demoOfStringOperations.reverseStringDemo();
//	demoOfStringOperations.reverseStringDemo2();
//	demoOfStringOperations.reverseWords();
//	demoOfStringOperations.tokenizedString();
//	demoOfStringOperations.bufferDelete();
	demoOfStringOperations.insertString();
}
}
