package com.xworkz.basic_java.EncapsulationExample;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
		 student.setName("Arjun");
		 student.setrollnumber(12345);
		 student.setclasRoom(12);
		 System.out.println(student.getName());
		 System.out.println(student.getrollnumber());
		 System.out.println(student.getclasRoom());
	}

}
