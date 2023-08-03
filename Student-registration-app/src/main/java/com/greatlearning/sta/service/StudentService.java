package com.greatlearning.sta.service;

import java.util.List;

import com.greatlearning.sta.model.Student;

public interface StudentService {
	
	List<Student> viewAllStudents();
	
	Student CreateStudent(Student student);
	
	Student updateStudent(long id, Student student);
	
	void deleteStudent(Long id);

}
