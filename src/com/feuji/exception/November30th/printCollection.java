package com.feuji.exception.November30th;


import java.util.*;

public class printCollection {
public void demoOfCollection()
{
	List<String> list=new ArrayList<String>();
	list.add("9");
	list.add("oiii");
	list.add("l");
//	Iterator iterator=list.iterator();
//	while(iterator.hasNext())
//	{
//		System.out.println(iterator.next());
//	}
	
	ListIterator<String>  listIterator=list.listIterator();
	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		
	}
//	while(listIterator.hasNext())
//		{
//			System.out.println(listIterator.next());
//		}
//	ListIterator<String>  listIterator1=list.listIterator(list.size());
//	while(listIterator1.hasPrevious());
//	{
//		
//		System.out.println(listIterator1.previous());
//
//		//System.out.println(listIterator1.previousIndex());
//	}
	for(int i=list.size()-1;i>=0;i--)
	{
		System.out.println(list.get(i));
	}
}
}
