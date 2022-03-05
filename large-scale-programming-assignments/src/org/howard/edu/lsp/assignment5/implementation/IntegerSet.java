package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



/**
 * Date: Mar 4-2022
 * This is an application for IntegerSets containing only integers.
 * @author asaadmartin
 */
public class IntegerSet {
	
	/**
	 * Class for an Array List
	 */
	private List<Integer>set= new ArrayList<Integer>();
	private ArrayList list;
	  
	   public IntegerSet(ArrayList list) {
	       this.list=list;
	   }
	  
	//Clears the internal representation of the set
	   /**
	 * Class to empty set.
	 */
	public void clear() {
	       list.clear();
	   }
	  
	//Returns the length of the set
	  
	   /**
	 * Returns the length of the set.
	 * @return The length of set as an integer.
	 */
	public int length() {
	       return list.size();
	   }
	  
	//Returns true if 2 lists are equal, false otherwise
	   /**
	 * Method to find if two sets are equal.
	 * @param b Takes in the integer set.
	 * @return Returns true or false depending on the set.
	 */
	public boolean equals(IntegerSet b) {
	      
	       ArrayList<Integer> list2=b.list;
	         
	       if(list.size()!=list2.size()) {
	           return false;
	       }
	         
	       ArrayList<Integer> temp1=list;
	         
	       ArrayList<Integer> temp2=list2;
	         
	       Collections.sort(temp1);
	       Collections.sort(temp2);
	         
	       for(int i=0;i<temp1.size();i++) {
	           if(temp1.get(i)!=temp2.get(i)) {
	               return false;
	           }
	       }
	         
	       return true;
	      
	   }
	  
	  
	//Returns the largest item in the set; Throws a  IntegerSetException if the set is empty
	  
	   /**
	 * Returns the largest item in the set; Throws a  IntegerSetException if the set is empty.
	 * @return The largest value in the set as an integer.
	 * @throws Listemptyexception For if the set is empty.
	 */
	public int largestelement() throws Listemptyexception {
	      
	       if(list.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int max=0;
	      
	       for(int i=0;i<list.size();i++) {
	           if((int) list.get(i) > max) {
	               max=(int) list.get(i);
	           }
	       }
	      
	       return max;
	      
	   }
	  
	//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	  
	   /**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty.
	 * @return The smallest value in the set as a integer.
	 * @throws Listemptyexception For if the set is empty.
	 */
	public int smallestelement() throws Listemptyexception {
	      
	       if(list.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int min=Integer.MAX_VALUE;
	      
	       for(int i=0;i<list.size();i++) {
	           if((int) list.get(i)<min) {
	               min=(int) list.get(i);
	           }
	       }
	      
	       return min;
	      
	   }
	  
	//Adds an item to the set or does nothing if it is already there
	  
	   /**
	 * Adds an item to the set or does nothing if it is already there.
	 * @param item Takes in a item (number) as an integer.
	 */
	public void addItem(int item ) {
	      
	       boolean exist=false;
	      
	       for(int i=0;i<list.size();i++) {
	          
	           if((int) list.get(i)==item) {
	               exist=true;
	           }
	       }
	      
	       if(exist==false) {
	           list.add(item);
	       }
	      
	   }
	  
	//Removes an item from the set or does nothing if it is not already there
	  
	   /**
	 * Removes an item from the set or does nothing if it is already there.
	 * @param item Takes in a item (number) as an integer.
	 */
	public void removeItem(int item ) {
	      
	      
	      
	       for(int i=0;i<list.size();i++) {
	          
	           if((int) list.get(i)==item) {
	               list.remove(i);
	           }
	       }
	      
	   }
	  
	//Set union
	   /**
	 * Method for making the sets union.
	 * @param list2 Takes in an IntegerSet List.
	 * @return Returns the sets union.
	 */
	public IntegerSet union(IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       Set<Integer> set = new HashSet<>();
	       set.addAll(list);
	       set.addAll(temp);
	      
	       ArrayList<Integer> list3= new ArrayList<>(set);
	      
	       IntegerSet list4= new IntegerSet(list3);
	      
	       return list4;
	      
	   }
	  
	//Set intersection
	   /**
	 * Method for making the sets intersect.
	 * @param list2 Takes in an IntegerSet List.
	 * @return Returns the set intersected.
	 */
	public IntegerSet intersection(IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       list.retainAll(temp);
	      
	IntegerSet list4= new IntegerSet(list);
	      
	       return list4;
	   }
	  
	//Set difference, i.e., s1-s2
	   /**
	 * Method for showing the difference between sets
	 * @param list2 Takes in an IntegerSet List
	 * @return Returns the set difference
	 */
	public IntegerSet difference (IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       // Remove all elements in list2 from list
	       list.removeAll(temp);
	      
	IntegerSet list4= new IntegerSet(list);
	      
	       return list4;
	      
	   }
	  
	   public ArrayList<Integer> getlist(){
	       return list;
	   }
	    
	}




