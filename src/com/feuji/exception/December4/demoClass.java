package com.feuji.exception.December4;

import java.util.Objects;

public class demoClass {
	
		
	
private String name;
private int id;
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
	demoClass other = (demoClass) obj;
	return id == other.id && Objects.equals(name, other.name);
}

public static void main(String[] args) {
	
}
	
}
