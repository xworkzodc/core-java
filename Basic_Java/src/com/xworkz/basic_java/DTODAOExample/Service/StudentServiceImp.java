package com.xworkz.basic_java.DTODAOExample.Service;
import com.xworkz.basic_java.DTODAOExample.DTO.StudentDTO;

public class StudentServiceImp implements StudentService{

	@Override
	public void addStudent(StudentDTO dto) {
		long number = dto.getphoneNo();
		int count =0;
		while (number>0) {
			number =number/10;
			count++;
		}
		if(count ==10 ) {
			studentDAO.addStudent(dto);
		}
		else {
			System.out.println("invalid number");
		}
		
		
		
	}

	@Override
	public StudentDTO getStudent(long phoneNo) {
		return studentDAO.getStudent(phoneNo);
	}

	@Override
	public void updateStudent(long phoneno, String batch) {
		// TODO Auto-generated method stub
		long temp=7400309602;
		long phoneNo;
		if(temp== this.getStudent(phoneNo)){
			studentDAO.updateStudent(phoneNo , batch);
		}
	}

}
