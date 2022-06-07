package com.Oppps.Inheritance.Multilavel_Inheritance;

public class Car {
	int a,b ,c;
 Car(){// this is constructor
	 a=20;
	 b=30;
	 c=a+b;
	 System.out.println("This is constructor in side the class"
	 		+ " car and adition of a+b :"+c);
 }
 void Speed() {
	 System.out.println("the  car maximum speed is 100");
 }
 
 void avrg() {
	 System.out.println("the car avg is 15");
 }
}
