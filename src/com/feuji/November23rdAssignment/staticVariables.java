package com.feuji.November23rdAssignment;

public class staticVariables {
static int value;
public staticVariables(int value) {
	this.value=value;
	System.out.println(value);
}
public static void main(String[] args) {
	staticVariables staticVariables=new staticVariables(10);
	System.out.println(value);
}
}
