package com.feuji.exception.December8th;

public class NumberCheckEvenOrOdd  {

//	@Override
//	public boolean numberIsEvenOrOdd(int value) {
//		if(value%2==0)
//		{
//			return true;
//		}
//		return false;
//	}

	


public static void main(String[] args) {
	
	NumberCheck check=(n)->{
		if(n%2==0)
			{
				return true;
			}
		return false;
	};
	System.out.println(check. numberIsEvenOrOdd(11));
}
}
