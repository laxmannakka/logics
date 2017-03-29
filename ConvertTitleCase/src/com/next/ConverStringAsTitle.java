package com.next;

import java.util.Scanner;

public class ConverStringAsTitle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter a String");
		    String string =scanner.nextLine();
		 
		    String str ="";        
		    char character ;

		    for(int i =0;i<string.length();i++)
		    {
		        character = string.charAt(i);
		       
		        if(i==0 && Character.isLowerCase(character))
		        {
		        	str =str+Character.toUpperCase(string.charAt(i));
		        }
		        else if(character==' ')
		        {
		            str = str+Character.toLowerCase(character)+(Character.toUpperCase(string.charAt(i+1)));
		            i++; 
		        }
		        else
		        {
		            str =str+(Character.toLowerCase(character));
		        }

		    }
		    System.out.println(str);
		}
	}


