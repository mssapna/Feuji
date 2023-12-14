package com.feuji.exception.November27th;

public class wrapperClassObject {
void wrapClassDemo()
{
	byte byteValue=29;
	System.out.println("wrapped byte value is:"+Byte.valueOf(byteValue));
	
	short shortValue=10;
	System.out.println("wrapped short value is:"+Short.valueOf(shortValue));
	
	int intValue=10;
	System.out.println("wrapped integer value is:"+Integer.valueOf(intValue));
	
	float floatValue=10.1f;
	System.out.println("wrapped float value is:"+Float.valueOf(floatValue));
	
	double doubleValue=10.09d;
	System.out.println("wrapped double value is:"+Double.valueOf(doubleValue));

	char charValue='j';
	System.out.println("wrapped character value is:"+Character.valueOf(charValue));
	
	boolean booleanValue=true;
	System.out.println("wrapped boolean value:"+booleanValue);
	
	
	//Write a program to convert from String to primitive values.

	String stringValue="34";
	System.out.println(String.valueOf(stringValue));
	
	//. Write a program throw NumberFormatException while converting from string to
    //primitive values.
	String stringValue1="34";
	System.out.println(Integer.parseInt(stringValue1));
	
	

}
	
	
	public static void main(String[] args) {
		wrapperClassObject classObject=new wrapperClassObject();
		classObject.wrapClassDemo();
	}
}
