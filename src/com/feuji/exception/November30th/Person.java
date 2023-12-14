package com.feuji.exception.November30th;

public class Person implements Comparable<Person> {
	   
	
		private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
	    }

	    @Override
	    public int compareTo(Person otherPerson) {
	        // Compare persons based on age
	        return Integer.compare(this.age, otherPerson.age);
	    }
	}



