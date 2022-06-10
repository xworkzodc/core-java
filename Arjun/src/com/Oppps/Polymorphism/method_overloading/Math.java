package com.Oppps.Polymorphism.method_overloading;

 public class Math {  // Mathmain is main class
	static int add(int a,int b) {
		int c=a+b;
		return c;
		//System.out.println(c); printing statement is not possible here.
	}
	static int 	add(int a,int b,int c) {
		   return a+b+c;
	}
}
