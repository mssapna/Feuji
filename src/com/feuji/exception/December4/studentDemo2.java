package com.feuji.exception.December4;

import java.util.Objects;

public class studentDemo2 implements Comparable {
private String student_name;
@Override
public int hashCode() {
	return Objects.hash(id, student_name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	studentDemo2 other = (studentDemo2) obj;
	return id == other.id && Objects.equals(student_name, other.student_name);
}
private int id;
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
	
}
@Override
public String toString() {
	return "studentDemo2 [student_name=" + student_name + ", id=" + id + "]";
}
}
