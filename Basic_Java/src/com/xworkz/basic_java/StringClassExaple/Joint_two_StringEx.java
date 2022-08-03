package com.xworkz.basic_java.StringClassExaple;

public class Joint_two_StringEx {

	

	public static void main(String [] args) {
		String me="Hello !";
		 System.out.println("Frist :"+ me);
		 
		 String you ="  How are you";
		 System.out.println("Second :"+ you);
		 
		 // i creat a variable for hold the data First and sencond.
		 
		 String joined= me. concat (you);	
		 
		 System.out.println("After concat :"+ joined);
	}
}
