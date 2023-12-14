package com.feuji.exception.December5th;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import comparatorDemo.student;

public class getKeyValuesWithoutKey {
void getKeyValues()
{
	Map<Integer,StudentPojoClass> map=new HashMap<>();
	map.put(1, new StudentPojoClass(1, "mohana"));
	map.put(2, new StudentPojoClass(2, "maria"));
	for(Map.Entry<Integer, StudentPojoClass> entry:map.entrySet())
	{
		System.out.println(entry.getKey());
	}
}
}
