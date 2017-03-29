package com.next;

public class Student {

	String name;
	String id;
	int rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name, String id, int rollNo) {
		super();
		this.name = name;
		this.id = id;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
	}
	
}
