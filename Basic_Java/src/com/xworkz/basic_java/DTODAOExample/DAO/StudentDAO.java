package com.xworkz.basic_java.DTODAOExample.DAO;

import com.xworkz.basic_java.DTODAOExample.DTO.StudentDTO;

public interface StudentDAO {
	void addStudent (StudentDTO dto);
	StudentDTO getStudent(long phoneNo);
	void updateStudent(long no, String batch);
}
