package com.feuji.exception.December11;

import java.util.function.Predicate;

public class SumOfAllPrimeNumbers {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(Integer value)->
		{
			if(value<=1) {
				return false;
			}
			for(int index=2;index<=value/2;index++)
			{
				if(value%index==0)
				{
					return false;
				}
			}
			return true;
		};
    }
}

