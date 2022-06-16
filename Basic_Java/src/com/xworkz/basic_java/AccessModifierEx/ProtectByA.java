package com.xworkz.basic_java.AccessModifierEx;

public class ProtectByA {
	int a= 40;
	int b=20 ,c;
	//The private access modifier is accessible only within the class.
	protected void add() { // Error is getting because we accessesing from an other class
	c=a+b;
	System.out.println(c);
	System.out.println("protected");
}
}
