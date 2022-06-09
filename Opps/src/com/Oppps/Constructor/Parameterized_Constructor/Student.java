package com.Oppps.Constructor.Parameterized_Constructor;

public class Student {
  int id;
  String name;
  String collageName;
  
  Student(int i,String n, String cn )
{
	 id=i;
	 name=n; 
	 collageName=cn;
	
	  }
    void show() {
    	 System.out.println(id+ " " + name + " " + collageName);
    	 }
}
