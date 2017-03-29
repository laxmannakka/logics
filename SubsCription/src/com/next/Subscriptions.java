package com.next;

import java.util.List;

public class Subscriptions 
{
	Student student;
	Course course;

	public Subscriptions(Student student, Course courseList) {
		super();
		this.student = student;
		this.course = courseList;
	}

	public Subscriptions(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course courseList) {
		this.course = courseList;
	}
}
