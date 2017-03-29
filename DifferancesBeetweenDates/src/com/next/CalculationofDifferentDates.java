package com.next;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculationofDifferentDates {

private void performDifferanceOperation(String date1,String date2)
{	
	String format ="dd/MM/yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    try {
		Date fromDate = sdf.parse(date1);
	    Date toDate = sdf.parse(date2);
        long differance = toDate.getTime() - fromDate.getTime();
        int diffDays = (int) (differance / (24 * 60 * 60 * 1000));
        System.out.println("Differance  of Dates is" + diffDays + "days");
        

	    } catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationofDifferentDates object = new CalculationofDifferentDates();
		object.performDifferanceOperation("26/2/2016", "2/3/2016");
		}

}
