package com.feuji.exception.December13;
import java.util.Arrays;
import java.util.List;
public class ListOfStudents {
	
//	    private String name;
//	    public String getName() {
//	        return name;
//	    }

	    public static void main(String[] args) {
	  
	        List<Student> studentList = Arrays.asList(
	                new Student("Johar"),
	                new Student("Alia"),
	                new Student("Bela"),
	                new Student("Elina")
	        );

	        
	        studentList.stream()
	                .map(Student::getName)
	                .forEach(System.out::println);
	    }
	}


