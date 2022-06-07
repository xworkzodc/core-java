package com.Oppps.Inheritance.Hierarchical_Inheritance;

public class Hierarchical_InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cow cow=new Cow();
     Elephant  elephant =new  Elephant();
     Loin loin =new Loin();
     
     // cow calling
     cow.eat();
     cow.milk();
      
     //Elephant calling
     elephant.eat();
     elephant.big();
     
     //Loin is calling
     loin.eat();
     loin.hunt();
  
	}

}
