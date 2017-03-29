package com.next;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String testDateString3 = "02-Apr-2014";
	       SimpleDateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");

	       Date d3 = df3.parse(testDateString3);
           System.out.println("Date: " + d3);
           System.out.println("Date in dd-MMM-yyyy format is: "+df3.format(d3));

	}

}
