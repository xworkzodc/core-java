package com.xworkz.basic_java.DTODAOExample.Service;
import com.xworkz.basic_java.DTODAOExample.DTO.StudentDTO;
public interface StudentService {
	
void addStudent (StudentDTO dto);

StudentDTO getStudent(long phoneNo);

void updateStudent(long no, String batch);
}
