package com.next;

import java.util.List;

public class Student 
{

public	String name;
public	int id;
public	List<Subscription> subscription;
public Course course;
	
	
	
	public List<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	


public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
}
