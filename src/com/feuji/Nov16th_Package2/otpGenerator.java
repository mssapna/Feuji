package com.feuji.Nov16th_Package2;

import java.util.Scanner;

public class otpGenerator {
void otpGeneratorMethod()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("**************PROGRAM STARTS************************");
	System.out.println("enter the number:");
	int value1=scanner.nextInt();
	int copy=value1;
	int count=0;
	while(value1!=0)
	{
		int rem=value1%10;
		value1=value1/10;
		count++;
	}
	if(count>4)
	{
		System.out.println("please provide valid otp");
	}
	else if(count==1)
	{
		System.out.println("000"+copy);
	}
	else if(count==2)
	{
		System.out.println("00"+copy);
	}
	else if(count==3)
	{
		System.out.println("0"+copy);
	}
	else {
		System.out.println(copy);
	}
	System.out.println("****************PROGRAM ENDS*************************");
}

public static void main(String[] args) {
	otpGenerator generator=new otpGenerator();
	generator.otpGeneratorMethod();
}
}
