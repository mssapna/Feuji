package com.feuji.exception.December12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfPrimeNumbers {
public static boolean isPrime(int num)
{
	if(num<=1)
	{
		return false;
	}
	for(int value1=2;value1<=num/2;value1++)
	{
		if(num%value1==0)
		{
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	Random random=new Random();
	for(int index=0;index<=100;index++)
	{
		list.add(random.nextInt(100));
	}
	list.stream().filter(i->isPrime(i)).forEach((e)->System.out.println(e));
}
}
