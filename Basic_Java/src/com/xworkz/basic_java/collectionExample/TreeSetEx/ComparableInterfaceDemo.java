package com.xworkz.basic_java.collectionExample.TreeSetEx;

import java.util.TreeSet;

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
	
		TreeSet<Student> student= new TreeSet<Student>(new StudentComparator());
		
       Student arjun = new Student();
       arjun.setId(1);
       arjun.setName("Arjun");
       
       Student nandish = new Student();
       nandish.setId(2);
       nandish.setName("Nandish");
       
       Student manohar = new Student();
       manohar.setId(3);
       manohar.setName("Manohar");
       
       Student varshini = new Student();
       varshini.setId(1);
       varshini.setName("Varshini");
       
       Student raghav = new Student();
       raghav.setId(1);
       raghav.setName("Raghav");
       
       student.add(raghav);
       student.add(varshini);
       student.add(manohar);
       student.add(nandish);
       student.add(arjun);
       
       System.out.println(student);
	}

}
