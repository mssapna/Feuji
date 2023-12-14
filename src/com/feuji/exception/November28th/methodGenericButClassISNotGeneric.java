package com.feuji.exception.November28th;

import java.util.ArrayList;
import java.util.List;

public class methodGenericButClassISNotGeneric {
     
	<T> void add(T value)
{
	List <T>list=new ArrayList<>();
	list.add(value);
	for(T l1:list)
	{
		System.out.println(l1);
	}
	
}
public static void main(String[] args) {
	methodGenericButClassISNotGeneric genericButClassISNotGeneric=new methodGenericButClassISNotGeneric();
	genericButClassISNotGeneric.<String>add("hello");
	genericButClassISNotGeneric.<Integer>add(10);
}
}
