package com.chandradeep;

public class Student {
private String name;
private String Roll;
private int mark;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoll() {
	return Roll;
}
public void setRoll(String roll) {
	Roll = roll;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [name=" + name + ", Roll=" + Roll + ", mark=" + mark + "]";
}
public Student(String name, String roll, int mark) {
	super();
	this.name = name;
	Roll = roll;
	this.mark = mark;
}


	
}
