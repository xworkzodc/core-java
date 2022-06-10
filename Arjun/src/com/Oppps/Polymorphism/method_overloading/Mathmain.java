package com.Oppps.Polymorphism.method_overloading;

public class Mathmain {
public static void main(String [] args) {
	Math math = new Math();
	math.add(10, 10);
	System.out.println(math.add(10, 1));// this access via object.
	System.out.println("adition :"+Math.add(10, 20));// Static method we can access via class name. 
	System.out.println(Math.add(10, 20, 30));
	System.out.println(Math.add(10, 2, 32));
}
}
