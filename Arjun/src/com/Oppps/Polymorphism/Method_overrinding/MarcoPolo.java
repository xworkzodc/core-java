package com.Oppps.Polymorphism.Method_overrinding;

public class MarcoPolo extends Vehicle {
	void name(int wheel) {
		  
		  if(wheel==4) {
			  System.out.println("This is car");
		  }
		  else if (wheel==6 || wheel==8) 
		  {
			  System.out.println("this is truck");
		  }
		  else {
			  System.out.println("This is bike");
		  }
		  
		}
}
