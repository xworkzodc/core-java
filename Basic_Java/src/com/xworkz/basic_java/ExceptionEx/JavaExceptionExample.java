package com.xworkz.basic_java.ExceptionEx;

public class JavaExceptionExample {

	private static int o;

	public static void main(String[] args) {
		try {
			int data =100/o;
		}
		catch(ArithmeticException e) {
			System.out.println("your exception is "+e);
			
		}

	}

}
