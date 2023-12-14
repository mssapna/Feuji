package com.feuji.exception.December8th;

public class PrintingOneToTen {
public static void main(String[] args) {
	OneToTen oneToTen=()->
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	};
	oneToTen.printOneToten();
}
}
