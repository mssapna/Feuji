package com.feuji.exception.November30th;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	
	    @Override
	    public int compare(Person person1, Person person2) {
	        // Compare persons based on name
	        return person1.getName().compareTo(person2.getName());
	    }
	}

