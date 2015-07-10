package com.classes.src;

public class Employee {
 private String empId;
 private int age;
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee(String empId, int age) {
	super();
	this.empId = empId;
	this.age = age;
}
 
}
