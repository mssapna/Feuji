package com.feuji.exception.December8th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionForComparator {

	
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(5,"vijaya"));
		employees.add(new Employee(2,"rani"));
		employees.add(new Employee(3,"rani"));
		employees.add(new Employee(4,"vijaya"));
		Comparator<Employee> C=(e1,e2)->
		{
			return e1.employeeId-e2.employeeId;
			
		};
		Collections.sort(employees,C);
		for(Employee e:employees)
		{
			System.out.println(e);
		}
		
		
	}
}
