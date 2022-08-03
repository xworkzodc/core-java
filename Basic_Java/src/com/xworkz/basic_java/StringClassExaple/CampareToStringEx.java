package com.xworkz.basic_java.StringClassExaple;

public class CampareToStringEx {

	public static void main(String[] args) {
		String first ="Mahesh MAltish";
		String second="Mahesh MAltish";
		String third="Another";
		
		boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);
	    
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	}

}
