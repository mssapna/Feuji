package comparatorDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class addOnlyNumbers {
public static void main(String[] args) {
	ArrayList arrayList=new ArrayList<>();
	arrayList.add("1");
	arrayList.add("k");
	arrayList.add("3");
	int sum=0;
	for(Object object:arrayList)
	{
		if(object instanceof Integer)
		{
			sum=(sum+(int)object);
		}
		
	}
	
	HashMap<Integer, Object> hashMap=new HashMap<>();
	for(int i=0;i<arrayList.size();i++)
	{
		hashMap.put(i, arrayList.get(i));
		
	}
	System.out.println(hashMap+" ");
	
	
//	System.out.println(sum);
//	
//	arrayList.set(0, 2);
//	System.out.println(arrayList);
//	arrayList.set(10, 45);
	
	
	
}

}
