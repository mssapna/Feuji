package com.feuji.exception.November30th;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class diffB_wIteratorEnumeration {
	
	
	     void diffOfIteraterAndEnumaration() {
	        // Create a Vector and add elements to it
	        Vector<String> vector = new Vector<>();
	        vector.add("One");
	        vector.add("Two");
	        vector.add("Three");
	        vector.add("Four");
	        vector.add("Five");

	        // Using Iterator
	        System.out.println("Using Iterator:");
	        Iterator<String> iterator = vector.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        System.out.println();

	        // Using Enumeration
	        System.out.println("Using Enumeration:");
	        Enumeration<String> enumeration = vector.elements();
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }
	    }
	

}
