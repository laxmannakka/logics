package com.next;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {


    ArrayList<Integer> list = new ArrayList<>();

    private void addElements()
    {
        for (int i = 0; i < 50; i++)
        {
            list.add(i, i + 2);
        }
    }

    private void removeElements()
    {
    	ArrayList<Integer > templist= list;
    	
       
        for (int i = 0; i < templist.size(); i++)
            {
                if (i % 3 == 0)
                {//Every 3rd element should be true
                    list.remove(i);
                    System.out.println("removed at"+i);
               }
            }
        
    	System.out.print(list);

    }
	
    private void removeElementsLogic()
    {
    	int j=0;
    	for(int i=0; i< list.size();)
    	{
    	j++;
    	if(j == 3)
    	{
    	list.remove(i);
    	j=0;
    	}
    	else
    	i++;
    	}
    	
    System.out.println(list);	
    	
    }
    
    private void deleteThirdElementInArrayList(){ 
    	   Iterator<Integer> iterator = list.iterator();
    	      int i=0;
    	      while(iterator.hasNext())
    	      {
    	      iterator.next();
    	      i++;
    	      if(i == 3)
    	      {
    	      iterator.remove();
    	      i = 0;
    	      }
    	      }
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		RemoveElement obj = new RemoveElement();
		obj.addElements();
		obj.removeElements();
		obj.removeElementsLogic();
		obj.deleteThirdElementInArrayList();
	}

}