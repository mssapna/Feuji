package com.feuji.exception.November27th;

public class differentMethodsOfWrapper {
void wrapperMethods()
{
	 Character charValue = 'A';

     String stringValue = charValue.toString();
     System.out.println("Character to String: " + stringValue);

     char primitiveValue = charValue.charValue();
     System.out.println("Primitive char value: " + primitiveValue);
 }
	

public static void main(String[] args) {
	differentMethodsOfWrapper differentMethodsOfWrapper=new differentMethodsOfWrapper();
	differentMethodsOfWrapper.wrapperMethods();
}
}
