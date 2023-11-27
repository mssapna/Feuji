package com.feuji.November23rdAssignment;

public class namesOfStudent {
	private String name = "sapna";

	namesOfStudent(String name) {
		this.name = name;
		System.out.println(name);
	}

	public namesOfStudent() {
		System.out.println("unknown");
	}

	public static void main(String[] args) {
		namesOfStudent namesOfStudent = new namesOfStudent();
		namesOfStudent namesOfStudent2 = new namesOfStudent("shreya");
	}
}
