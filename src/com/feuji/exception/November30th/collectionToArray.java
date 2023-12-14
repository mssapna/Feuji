package com.feuji.exception.November30th;

import java.util.ArrayList;

public class collectionToArray {
	void conversionOfCollectionToArray()
	{
		ArrayList list=new ArrayList<>();
		list.add("I'm");
		list.add("working");
		list.add("as");
		list.add("intern");
		
		String [] stringArrayValues=(String[]) list.toArray(new String[0]);
		for(int i=0;i<=stringArrayValues.length-1;i++)
		{
			System.out.println(stringArrayValues[i]);
		}
	}
	public static void main(String[] args) {
		collectionToArray array=new collectionToArray();
		array.conversionOfCollectionToArray();
	}
}
