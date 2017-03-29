package com.next;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	ArrayList<Subscriptions> subscriptionList = new ArrayList<>();
	ArrayList<Student> studentList = new ArrayList<>();
	Map<Integer, List<String>> subscriptionMap = new HashMap<Integer, List<String>>();

	// here arranging the students and subscription
	public void populateSubscription() {
		studentList.add(new Student("laxman", 1));
		studentList.add(new Student("nadim", 2));
		studentList.add(new Student("priyanka", 3));
		studentList.add(new Student("jyothis", 4));

		subscriptionList.add(new Subscriptions(studentList.get(0), new Course("Mathamatics")));
		subscriptionList.add(new Subscriptions(studentList.get(1), new Course("English")));

		subscriptionList.add(new Subscriptions(studentList.get(2), new Course("Maths")));
		subscriptionList.add(new Subscriptions(studentList.get(3), new Course("Sceience")));

		subscriptionList.add(new Subscriptions(studentList.get(0), new Course("English")));
		subscriptionList.add(new Subscriptions(studentList.get(1), new Course("Social")));

	}

	// arranging the map and subscriptions
	private void arrangeMap()
	{
		for (Student student : studentList)
		{
			List<String> list = new ArrayList<>();

			for (int i = 0; i < subscriptionList.size(); i++) 
			{
				if (student.getStudentId() == subscriptionList.get(i).getStudent().getStudentId()) {
					list.add(subscriptionList.get(i).getCourse().getCoursename());
				}
			}
			subscriptionMap.put(student.getStudentId(), list);
		}
	}

	private void arrangeMapBasedOnKey()
	{
		List<String> subscriptionsList;
		for(Subscriptions subscription: subscriptionList)
	   	{
	   	int studentId = subscription.getStudent().getStudentId();
	    if(subscriptionMap.get(studentId) == null)
	   	{
	    	subscriptionsList = new ArrayList<>();
	    	subscriptionsList.add(subscription.getCourse().coursename);
	   	
	    	subscriptionMap.put(studentId, subscriptionsList);
	   	}
	   	else
	   	{
	   		subscriptionsList = subscriptionMap.get(studentId);
	   		subscriptionsList.add(subscription.getCourse().coursename);
	   		subscriptionMap.put(studentId, subscriptionsList);
	}
	   	}

	}

	private void getSubscriptionsForStudent(int key) {
		List<String> subscriptionList = subscriptionMap.get(key);

		if (subscriptionList != null && subscriptionList.size() > 0) {
			System.out.println("Subscriptions are");
			for (int i = 0; i < subscriptionList.size(); i++) {
				System.out.println("" + subscriptionList.get(i));
			}
		} else {
			System.out.println("Subscriptions are Not Found");

		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass obj = new MainClass();
		obj.populateSubscription();
		//obj.arrangeMap();
		obj.arrangeMapBasedOnKey();
		Scanner in = new Scanner(System.in);
		int i = 0;
		while (i < 10) {
			System.out.println("Enter a search student");

			int key = in.nextInt();
			obj.getSubscriptionsForStudent(key);
		}
	}
}
