package com.feuji.exception.December5th;

import java.util.HashMap;
import java.util.Map;

public class KeysAndValuesATATime {
	void getKeyAndValues()
	{
		Map<Integer,StudentPojoClass> map=new HashMap<>();
		map.put(1, new StudentPojoClass(1, "mohana"));
		map.put(2, new StudentPojoClass(2, "maria"));
		for(Map.Entry<Integer, StudentPojoClass> entry:map.entrySet())
		{
			System.out.println("KEY:"+entry.getKey()+" "+"VALUES:"+entry.getValue());
		}
	}
}
