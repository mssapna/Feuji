package com.feuji.exception.November27th;

public class wrapperDemo {
public static void main(String[] args) {
	//Integer intNumber=new Integer(10);
	Integer intNumber=1;
	System.out.println("Integer Wrapper Class:");
	System.out.println("entered value is:"+intNumber);
	System.out.println("Binary:"+Integer.toBinaryString(intNumber));
	System.out.println("octal:"+Integer.toOctalString(intNumber));
	System.out.println("hexadecimal:"+Integer.toHexString(intNumber));
	System.out.println("maxValue:"+Integer.MAX_VALUE);
	System.out.println("mInValue:"+Integer.MIN_VALUE);
	
	   Double doubleNum = 12.7d;
       System.out.println("Double Wrapper Class:");
       System.out.println("Value: " + doubleNum);
       System.out.println("Exponent: " + Double.toHexString(doubleNum));
       System.out.println("Max Value: " + Double.MAX_VALUE);
       System.out.println("Min Value: " + Double.MIN_VALUE);
       System.out.println("NaN: " + Double.isNaN(doubleNum));
       System.out.println();
       
       Character charValue = 'A';
       System.out.println("Character Wrapper Class:");
       System.out.println("Value: " + charValue);
       System.out.println("Unicode: " + Character.getNumericValue(charValue));
       System.out.println("Is Digit: " + Character.isDigit(charValue));
       System.out.println("Is Letter: " + Character.isLetter(charValue));
       System.out.println();


       Boolean boolValue = true;
       System.out.println("Boolean Wrapper Class:");
       System.out.println("Value: " + boolValue);
       System.out.println("Logical NOT: " + Boolean.logicalXor(boolValue, boolValue));
       System.out.println("Logical AND: " + Boolean.logicalAnd(boolValue, true));
       System.out.println("Logical OR: " + Boolean.logicalOr(boolValue, false));

}
}
