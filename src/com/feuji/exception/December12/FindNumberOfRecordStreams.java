package com.feuji.exception.December12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindNumberOfRecordStreams {
public static void main(String[] args) {
	List<String> list=Arrays.asList("DIVYA","naina");
//	list.add("kavya");
//	list.add("harshitha");
	long count=list.stream().count();
	Stream s=list.stream();
	//System.out.println(count);
	s.forEach(System.out::println);
	s.filter(i->i.equals("naina"));
}
}
