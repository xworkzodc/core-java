package com.xworkz.basic_java.BeanExample;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setSalary(8500.50);
		System.out.println("Your salary is :"+employee.getSalary());
		employee.setId1("1A2CE3");
		System.out.println("Your id is :"+employee.getId1());
		
	}
}
