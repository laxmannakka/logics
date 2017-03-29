package com.next;

import java.util.Scanner;

public class CalculateHour
{
	
private void calculateTimeFromSeconds(int seconds)
{

		int hours = seconds / 3600;
		int  minutes = (seconds%3600)/60;
		int seconds_output = (seconds% 3600)%60;
	        System.out.println(hours  + " hours :" + minutes + " minutes:" + seconds_output +" seconds"); 
	   }

	
	public  static void main(String [] args)
	{
		CalculateHour object = new CalculateHour();
	  System.out.println("The time entered in hours,minutes and seconds is:");
	  Scanner scanner = new Scanner(System.in);	
	  int seconds = scanner.nextInt();
	  object.calculateTimeFromSeconds(seconds);
	}
}
