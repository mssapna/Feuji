package com.feuji.exception.December12;

import java.util.ArrayList;
import java.util.List;

 class ListOfEmployees {
public static void main(String[] args) {
	List<Employees> list=new ArrayList<>();
	list.add(new Employees(1, "naina"));
	list.add(new Employees(2, "jyothi"));
	
	list.stream().forEach(System.out::println);
}
}
