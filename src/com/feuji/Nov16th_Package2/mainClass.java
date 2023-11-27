package com.feuji.Nov16th_Package2;

public class mainClass implements Child{
public static void main(String[] args) {
	Child child=new mainClass();
	System.out.println(child.a);
	System.out.println(Child.b);
}
}
