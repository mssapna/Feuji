package com.feuji.exception.December12;

public class Employees {
int employeeId;
String emloyeeName;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmloyeeName() {
	return emloyeeName;
}
public void setEmloyeeName(String emloyeeName) {
	this.emloyeeName = emloyeeName;
}
@Override
public String toString() {
	return "Employees [employeeId=" + employeeId + ", emloyeeName=" + emloyeeName + "]";
}
public Employees(int employeeId, String emloyeeName) {
	super();
	this.employeeId = employeeId;
	this.emloyeeName = emloyeeName;
}
}
