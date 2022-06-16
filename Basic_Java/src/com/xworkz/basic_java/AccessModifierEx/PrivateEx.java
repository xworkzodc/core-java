package com.xworkz.basic_java.AccessModifierEx;

public class PrivateEx {
   
	private void prvt() {
		System.out.println("This mathed is Praivate :The private access modifier is accessible only within the class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateEx privateEx=new PrivateEx();
		privateEx.prvt();
		
	}

}
