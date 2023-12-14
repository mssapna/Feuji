package com.feuji.exception.November30th;
import java.util.ArrayList;
import java.util.Iterator;
public class studentElementsToArrayList {
	  void addStudent() {
	        // Creating an ArrayList to store Student objects
	        ArrayList<Student> studentList = new ArrayList<>();

	        // Adding Student objects to the ArrayList
	        studentList.add(new Student("shreya", 101));
	        studentList.add(new Student("riya", 102));
	        studentList.add(new Student("naina", 103));
	        studentList.add(new Student("madhu", 104));
	        studentList.add(new Student("riva", 105));

	        // Displaying elements using a for loop
	        System.out.println("Elements using for loop:");
	        for (int i = 0; i < studentList.size(); i++) {
	            System.out.println(studentList.get(i));
	        }

	        // Displaying elements using Iterator interface
	        System.out.println("\nElements using Iterator interface:");
	        Iterator<Student> iterator = studentList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	
}
