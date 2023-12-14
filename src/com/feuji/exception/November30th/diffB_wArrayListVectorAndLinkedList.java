package com.feuji.exception.November30th;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class diffB_wArrayListVectorAndLinkedList {
	

	
	    void  operationOnCollection() {
	        // ArrayList Example
	        System.out.println("ArrayList Example:");
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("One");
	        arrayList.add("Two");
	        arrayList.add("Three");
	        System.out.println("ArrayList Elements: " + arrayList);
	        System.out.println("Size of ArrayList: " + arrayList.size());
	        System.out.println();

	        // Vector Example
	        System.out.println("Vector Example:");
	        Vector<String> vector = new Vector<>();
	        vector.add("Four");
	        vector.add("Five");
	        vector.add("Six");
	        System.out.println("Vector Elements: " + vector);
	        System.out.println("Size of Vector: " + vector.size());
	        System.out.println();

	        // LinkedList Example
	        System.out.println("LinkedList Example:");
	        LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("Seven");
	        linkedList.add("Eight");
	        linkedList.add("Nine");
	        System.out.println("LinkedList Elements: " + linkedList);
	        System.out.println("Size of LinkedList: " + linkedList.size());
	        System.out.println();

	        // Common Operations
	        System.out.println("Common Operations:");
	        // Adding an element
	        arrayList.add("Ten");
	        vector.add("Ten");
	        linkedList.add("Ten");

	        // Removing an element
	        arrayList.remove("Three");
	        vector.remove("Three");
	        linkedList.remove("Three");

	        // Iterating through elements
	        System.out.println("ArrayList Elements after operations: " + arrayList);
	        System.out.println("Vector Elements after operations: " + vector);
	        System.out.println("LinkedList Elements after operations: " + linkedList);
	    }
	

}
