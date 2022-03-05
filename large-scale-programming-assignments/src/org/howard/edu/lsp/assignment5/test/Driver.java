package org.howard.edu.lsp.assignment5.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.Listemptyexception;

/**
 * Date: Mar 4-2022
 * This is the sample of code for the driver.
 * @author asaadmartin
 */
public class Driver {

	 public static void main(String[] args) throws Listemptyexception {
	      
		 ArrayList<Integer> list1= new ArrayList<>();
		 ArrayList<Integer> list2= new ArrayList<>();
		   
		   
		 IntegerSet set1= new IntegerSet(list1);
		 IntegerSet set2= new IntegerSet(list2);
		 
		 
		 System.out.println("Set 1 : "+set1.getlist());
		 System.out.println("\n"); 
		 
		 set1.addItem(3);
		 System.out.println("Added an item to Set 1");
		 System.out.println("Set 1 : "+set1.getlist());
		 System.out.println("\n");
		 
		 set1.clear();
		 System.out.println("Cleared Set 1");
		 System.out.println("Set 1 : "+set1.getlist());
		 System.out.println("\n");
		 
		 
		 
		 set1.addItem(1);
		 set1.addItem(5);
		 set1.addItem(6); 
		 set1.addItem(0);
		 set1.addItem(8);
		 set1.addItem(7);
		 System.out.println("Added items to Set 1");
		 System.out.println("Set 1 : "+set1.getlist());
		 System.out.println("Length of Set 1 : "+set1.length());
		 System.out.println("\n");
	
		   
		 set2.addItem(1);
		 set2.addItem(2);
		 set2.addItem(3);
		 set2.addItem(4);
		 set2.addItem(5);
		 set2.addItem(10);
		 set2.addItem(7);
		 System.out.println("Added items to Set 1"); 
		 System.out.println("Set 2 : "+set2.getlist());
		 System.out.println("\n");
		
		 set2.removeItem(1);
		 System.out.println("Removed an item from Set 2");
		 System.out.println("Set 2 : "+set2.getlist());
		 System.out.println("\n");
		   
		 System.out.println("Is equal : "+set1.equals(set2));
		   
		 System.out.println("Largest element in Set 1 : "+set1.largestelement());
		 
		 System.out.println("Largest element in Set 2 : "+set2.largestelement());
		 
		 System.out.println("Smallest element in Set 1 : "+set1.smallestelement());
		   
		 System.out.println("Smallest element in Set 2 : "+set2.smallestelement());
		   
		 IntegerSet setu= set1.union(set2);
		   
		 System.out.println("Union : "+setu.getlist() );
		   
		 IntegerSet seti= set1.intersection(set2);
		   
		 System.out.println("Intersection : "+seti.getlist() );
		 
		 IntegerSet setd = set2.difference(set1);
		 
		 System.out.println("Difference : "+setd.getlist() );
		 
		       
		    }

	}


