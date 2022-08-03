package com.xworkz.basic_java.DTODAOExample.DAO;

import com.xworkz.basic_java.DTODAOExample.DTO.StudentDTO;

public class StudentDAOImp implements StudentDAO{

	StudentDTO[] students =new StudentDTO[10];
	int index=0;
	@Override
	public void addStudent(StudentDTO dto) {
		this.students [this.index]=dto;
		// TODO Auto-generated method stub
		
	}
	@Override
	public StudentDTO getStudent(long phoneNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateStudent(long no, String batch) {
		// TODO Auto-generated method stub
		
	}
			
}
