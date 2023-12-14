package com.feuji.exception.November28th;

import java.util.ArrayList;
import java.util.List;

public class boundTypeParameters {
	
	

	
public void display(ArrayList<? extends Number> list)
{
	for(Object obj:list)
	{
		System.out.println(obj);
	}
}
public static void main(String[] args) {
	boundTypeParameters boundTypeParameters=new boundTypeParameters();
	ArrayList <Number>list =new ArrayList<>();
	list.add(10);
	list.add(38.9);
	
	boundTypeParameters.display(list);
	
}
}
