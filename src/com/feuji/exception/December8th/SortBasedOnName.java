package com.feuji.exception.December8th;

import java.util.Comparator;

public class SortBasedOnName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.employeeName.compareTo(o2.employeeName);
	}
}
