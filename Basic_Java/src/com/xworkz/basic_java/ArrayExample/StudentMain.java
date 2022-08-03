package com.xworkz.basic_java.ArrayExample;

public class StudentMain {

	public static void main(String[] args) {
		 
		    	
		    	
			    
			    
			
					
					Student arr[] =new Student[5];
			    	arr[0]=new Student(1,"Arjun");
			    	arr[1]=new Student(2,"Abhi");
			    	arr[2]=new Student(1,"Ravi");
			    	arr[3]=new Student(1,"Mahant");
			    	arr[4]=new Student(1,"Aman");
			    	System.out.println(arr[3]);
			    	
			    	  for (int i = 0; i < arr.length; i++)
			              System.out.println("Element at " + i + " : " +
			                          arr[i].roll_no +" "+ arr[i].name);
			    	
				}
 
	}


