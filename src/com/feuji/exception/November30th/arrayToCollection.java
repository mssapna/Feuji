package com.feuji.exception.November30th;

import java.util.Arrays;
import java.util.List;

public class arrayToCollection {
void conversionOfArrayToCollection()
{
	int [] arrayValues= {10,2,65,89};
	List listValues= Arrays.asList(Arrays.toString(arrayValues));
	for(Object obj:listValues)
	{
		System.out.println(obj);
	}
}
public static void main(String[] args) {
	arrayToCollection arrayToCollection=new arrayToCollection();
	arrayToCollection.conversionOfArrayToCollection();
}
}
