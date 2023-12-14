package com.feuji.exception.November27th;

public class stringOrNumber {
void StringOrNumber(String stringValue) {
	
	try {
	int value=Integer.parseInt(stringValue);
	if(value>=0)
	{
		System.out.println("its a number");;
	}
	}
	catch(NumberFormatException e)
	{
	
	System.out.println("its a string");
	}
	
}
public static void main(String[] args) {
	stringOrNumber stringOrNumber=new stringOrNumber();
	stringOrNumber.StringOrNumber("ajdj");
}
}
