package com.feuji.Nov16th_Package2;

public class mathematical_Operation1 implements mathematical_Operation {

	@Override
	public void caluculate() {
		int value1=20;
		int value2=10;
		System.out.println((value1*6)/value2+value1-a);
		//a=90;
		//the final field mathematical_Operation.Calculate.a cannot be assigned
	}

	public static void main(String[] args) {
		mathematical_Operation mathematical_Operation=new mathematical_Operation1();
		mathematical_Operation.caluculate();
		
		
		
	}
	
}
