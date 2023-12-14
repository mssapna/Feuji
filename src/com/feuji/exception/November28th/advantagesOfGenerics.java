package com.feuji.exception.November28th;

import java.util.ArrayList;
import java.util.List;

public class advantagesOfGenerics {
//Type Safety without generics
	void add()
	{
List list= new ArrayList();
list.add(10);
list.add("89");
	}
	
	//with generics
	<T> void addMethod1(T value)
	{
		List <T>list1=new ArrayList<>();
		list1.add(value);
	}
	
	//Type casting is not required without generics
	void addMethod2()
	{
	List list2=new ArrayList();
	list2.add("sapna");
	String stringValue=(String) list2.get(0);
	}
	
	//with generics
	 void addMethod3()
	{
		List <String>list3=new ArrayList<>();
		list3.add("sapna");
		
	}
	
	
	public static void main(String[] args) {
		advantagesOfGenerics advantagesOfGenerics=new advantagesOfGenerics();
		advantagesOfGenerics.<Integer>addMethod1(10);
	}
}
