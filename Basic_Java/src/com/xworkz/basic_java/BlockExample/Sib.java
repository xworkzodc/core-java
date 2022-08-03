package com.xworkz.basic_java.BlockExample;

public class Sib {
	String name;
	String type;
  static int price;
 
	
	static{  
		System.out.println("This is sib");
        price =20;
        System.out.println("Price"+price);
        
       
	}
	{
		System.out.println("This is iib");
		this.name="Arjun";
		this.type="Darshan";
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
	}
}
