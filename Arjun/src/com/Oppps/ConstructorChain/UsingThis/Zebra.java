package com.Oppps.ConstructorChain.UsingThis;

public class Zebra {//this:  to invoke current class constructor
	
  Zebra(){
	
	  System.out.println("first::this:  to invoke current class constructor");
}
  
  Zebra(int num){
	  
	  this();
	  System.out.println("Second::this:  to invoke current class constructor "+num);
	 
  }
  
}
