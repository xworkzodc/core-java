package com.xworkz.basic_java.collectionExample.TreeSetEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) 
	{
		
		TreeSet <String> tr =new TreeSet<String>();
		
		tr.add("Abhi");
		tr.add("eg");
		tr.add("dol");
		tr.add("cibin");
		tr.add("bari");
		
        /* Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
		It is called an "iterator" because "iterating" is the technical term for looping. To use an Iterator,
		you must import it from the java. util package.*/
		  Iterator<String> itr=tr.iterator();  
		  while(itr.hasNext()){  
			
		
		   System.out.println(itr.next());  
		  }  
		/*  Iterator<String> itr=tr.iterator();  
		Iterator<String> bari = null;
		if(itr==bari) {
			  System.out.println("this surname");  
		}
		else {
			 System.out.println(itr.next());*/
		}
	}


