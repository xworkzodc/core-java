package com.xworkz.basic_java.collectionExample.TreeSetEx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetHm1 {
	 public static void main(String[] args)
	    {
	        // Creating a Set interface with reference to
	        // TreeSet
	        Set<String> ts1 = new TreeSet<>();
	  
	        // Elements are added using add() method
	        ts1.add("Abhi");
	        ts1.add("Ram");
	        ts1.add("shyam");
	  
	        // Duplicates will not get insert
	        ts1.add("C");
	        ts1.add("1");
	        ts1.add("4");
	        int count1=((CharSequence) ts1).length();
	  
	        // Elements get stored in default natural
	        // Sorting Order(Ascending)
	        System.out.println(count1);
}
	 }
