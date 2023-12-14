package com.feuji.exception.November30th;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class addPrimitiveDataType {
	

	    void addPrimitiveDataType() {
	        // Creating an ArrayList to store primitive data type elements (int in this case)
	        ArrayList<Integer> intArrayList = new ArrayList<>();

	        // Adding elements to the ArrayList
	        intArrayList.add(10);
	        intArrayList.add(20);
	        intArrayList.add(30);
	        intArrayList.add(40);
	        intArrayList.add(50);

	        // Displaying elements using a for loop
	        System.out.println("Elements using for loop:");
	        for (int i = 0; i < intArrayList.size(); i++) {
	            System.out.println(intArrayList.get(i));
	        }

	        // Displaying elements using Iterator interface
	        System.out.println("\nElements using Iterator interface:");
	        Iterator<Integer> iterator = intArrayList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


