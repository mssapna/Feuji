package com.feuji.exception.December4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicateElements {
void detectDuplicate()
{
	Set<String> string=new HashSet<>();
	string.add("apple");
	string.add("Ball");
	string.add("Ball");
	string.add("Cat");
	Iterator< String> iterator=string.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}
}
