package com.feuji.exception.December4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class addPrimitiveData {
	void addProduct()
	{
Set<Integer> set=new HashSet<>();
set.add(12);
set.add(7);
set.add(90);
Iterator<Integer> iterator=set.iterator();
while(iterator.hasNext())
{
System.out.println(iterator.next());
}
	}
	
}
