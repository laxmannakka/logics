package com.next;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	MainObject mainObject = new MainObject();
	HashMap<Integer, List<Subscription>> map = new HashMap();
	
	
	
	// Setting 10 students here
	private void setStudentdata()
	{
		ArrayList<Student> studentList = new ArrayList<>();
	
		for(int i=0;i<10;i++)
		{
		Student student = new Student();
		student.setId(i);
		student.setName("laxman");
		Course course = new Course();
		course.setCoursename("Engineering");
		student.setCourse(course);
		// for Subscription List
		ArrayList<Subscription >subscriptionList = new ArrayList<>();

		if(i%2==0)
		{
			for(int j=0;j<2;j++)
			{
				Subscription subscription= new Subscription();
				if(j==1)
				subscription.setSubcriptionName("Secience");
				else
				{
					subscription.setSubcriptionName("Maths");

				}
				subscription.setSubscriptionId(j);
				subscriptionList.add(subscription);
			}
		}
		else
		{
			Subscription subscription= new Subscription();
			subscription.setSubcriptionName("nothing");
			subscription.setSubscriptionId(0);
			subscriptionList.add(subscription);
		}
		
		student.setSubscription(subscriptionList);
		studentList.add(student);
	}
	mainObject.setStudent(studentList);
	
	}
	
	// arranging the map with student id and Subscriptions
	private void arrangeMap()
	{
		
		List<Student> studentData = mainObject.getStudent();
		for(int i=0;i<studentData.size();i++)
		{
		List<Subscription> subCription = studentData.get(i).getSubscription();
			int id=	studentData.get(i).getId();
			subCription.add(e)
		}
		map.put(id, subCription);

	}
	
	
	//getting the Subscriptions from  the key and showing here only
	private void getStudentDataFromKey(int id)
	{
	List<Subscription> selectedStudentSubscription=	map.get(id);
	
	if(selectedStudentSubscription == null )
	{
		System.out.println("No Subscriptions For That key");
		return;
	}
		
	System.out.println("Subscriptions are");
	for(int i=0;i<selectedStudentSubscription.size();i++)
	{
		Subscription data = selectedStudentSubscription.get(i);
		System.out.println("SubsCriptionName--- "+data.getSubcriptionName());
		System.out.println("SubsCriptionId --- "+data.getSubscriptionId());
	}
	
	}
	
	
	// main function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		MainClass obj = new MainClass();
		obj.setStudentdata();
		obj.arrangeMap();
		int i=0;
		
		while(i<10)
		{
			System.out.println("Enter key from range 0-10");
			int key = scanner.nextInt();
			obj.getStudentDataFromKey(key);
		}
		
	}

}
