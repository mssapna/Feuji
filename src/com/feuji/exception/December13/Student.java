package com.feuji.exception.December13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import comparatorDemo.student;

public class Student {
	    private String name;
	    private String gender;
	    private String stream;
	    private String state;
	    private String city;

	    public Student(String name, String gender, String stream, String state, String city) {
			super();
			this.name = name;
			this.gender = gender;
			this.stream = stream;
			this.state = state;
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStream() {
			return stream;
		}
		public Student(String name, String gender, String stream) {
			super();
			this.name = name;
			this.gender = gender;
			this.stream = stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		public Student(String name) {
	        this.name = name;
	        
	    }
	    public String getGender() {
			return gender;
		}


	    public Student(String name, String gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

	    public String getName() {
	        return name;
	    }
	    
		@Override
	    public String toString() {
	        return "Student [name=" + name + ", gender=" + gender + "]";
		}  
	        public static void main(String[] args) {
	            List<Student> studentList = Arrays.asList(
	                    new Student("Johny", "Male","CS","Bangalore","Karnataka"),
	                    new Student("Alia", "Female","Mech","Patna","Bihar"),
	                    new Student("Bablu", "Male","It","Thirvannamalia","Tamil Nadu"),
	                    new Student("Elia", "Female","Mech","Annathapura","Annathapura"),
	                    new Student("Chaith", "Male","EC","Karnataka","Bangalore"),
	                    new Student("Divya", "Female","EC","Bangalore","Karnataka")
	            );
	            
  //2.Write a program to  show count of male and female students from the student records using streams?

//	            Map<String, Long> genderCountMap = studentList.stream()
//	                    .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
//
//	            genderCountMap.forEach((gender, count) ->
//	                    System.out.println("Number of " + gender + " students: " + count));
	            
	         
	            
// 3.Write a program to list students who come under the CSE department using streams?
            
//	            List<Student> cseStudents = studentList.stream()
//	                    .filter(student -> "CS".equals(student.getStream()))
//	                    .collect(Collectors.toList());
//
//	            // Display the list of CSE department students
//	            System.out.println("CSE Department Students:");
//	            cseStudents.forEach(student -> System.out.println(student.getName()));
	
	   
//4.Names of the students categorized by department using streams?
         
//	        Map<String, List<String>> studentsByDepartment = studentList.stream()
//	                .collect(Collectors.groupingBy(
//	                        Student::getStream,
//	                        Collectors.mapping(Student::getName, Collectors.toList())
//	                ));
//
//	        studentsByDepartment.forEach((department, names) -> {
//	            System.out.println(department + " Department Students:");
//	            names.forEach(System.out::println);
//	            System.out.println();
//	        });
	            
	      
//5.List female students from the Mech department using streams?	            
//	            List<String> femaleMechStudents = studentList.stream()
//	                    .filter(student -> "Female".equals(student.getGender()) && "Mech".equals(student.getStream()))
//	                    .map(Student::getName)
//	                    .collect(Collectors.toList());
//
//	            
//	            System.out.println("Female Mech Department Students:");
//	            femaleMechStudents.forEach(System.out::println);
	          
//6.Write a program to show State, City wise student count using streams?
	            Map<String, Map<String, Long>> stateCityStudentCount = studentList.stream()
	                    .collect(Collectors.groupingBy(
	                            Student::getState,
	                            Collectors.groupingBy(Student::getCity, Collectors.counting())
	                    ));
	            stateCityStudentCount.forEach((state, cityMap) -> {
	                System.out.println(state + " State:");
	                cityMap.forEach((city, count) -> {
	                    System.out.println("  " + city + ": " + count + " students");
	                });
	                System.out.println();
	            });
	        }    
	        }
	        
	    

			
			
	



