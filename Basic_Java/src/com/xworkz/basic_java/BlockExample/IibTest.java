package com.xworkz.basic_java.BlockExample;

public class IibTest {
int a=10 ,b=20;
String name;
String type;
double price;
String dimension;

{

	this.name = "Tv";
	this.type= "LED";
	this.price= 500;
	this.dimension="3d"; 
	System.out.println("Name:"+name);
	System.out.println("Type:"+type);
	System.out.println("Price:"+price);
	System.out.println("Dimension:"+dimension);
	
}

IibTest(){
	System.out.println("This is Constructor");
}

{
	System.out.println("This is First IIB");
	System.out.println(a+b);	
}
{
	System.out.println("This is Second IIB");
	System.out.println(b-a);	
}
}
