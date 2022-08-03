package com.xworkz.basic_java.NiranajnDaoDto;

import java.util.List;

public interface StudentDao {   //Create Data Access Object Interface.
	  public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);
}
