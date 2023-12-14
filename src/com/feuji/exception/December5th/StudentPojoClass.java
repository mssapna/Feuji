package com.feuji.exception.December5th;

import java.util.Objects;

public class StudentPojoClass {
private int id;
private String name;
public StudentPojoClass(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "StudentPojoClass [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentPojoClass other = (StudentPojoClass) obj;
	return id == other.id && Objects.equals(name, other.name);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
