package com.next;

import java.lang.reflect.Array;
import java.util.Random;

public class ShuffleArray {

	int aray[] =  {1,2,33,4,55,6,67,8,9,10};

	
	
	 void shuffleArray()
	  {
	 	    Random random = new Random();
	    for (int i = aray.length - 1; i > 0; i--)
	    {
	      int index = random.nextInt(i + 1);
	      int a = aray[index];
	      aray[index] = aray[i];
	      aray[i] = a;
	    }
	  }
	
	 private void printArray()
	 {
		 System.out.println("After Shufling Array ");
			for(int i=0;i<aray.length;i++)
			{
				System.out.print(" "+aray[i]);
			}
			
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuffleArray object = new ShuffleArray();
		object.shuffleArray();
		object.printArray();
	
	}

}
