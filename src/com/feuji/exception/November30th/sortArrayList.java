package com.feuji.exception.November30th;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortArrayList {
	
	    void arrayListSort() {
	        // Creating an ArrayList of Person objects
	        ArrayList<Person> personList = new ArrayList<>();
	        personList.add(new Person("alia", 25));
	        personList.add(new Person("katrina", 30));
	        personList.add(new Person("shreya", 20));
	        personList.add(new Person("riya", 35));

	        // Sorting using Comparable (based on age)
	        Collections.sort(personList);
	        System.out.println("Sorted by age (using Comparable):");
	        printPersonList(personList);

	        // Sorting using Comparator (based on name)
	        Collections.sort(personList, new PersonComparator());
	        System.out.println("\nSorted by name (using Comparator):");
	        printPersonList(personList);
	    }

	    private static void printPersonList(ArrayList<Person> personList) {
	        for (Person person : personList) {
	            System.out.println(person);
	        }
	    }
	}


