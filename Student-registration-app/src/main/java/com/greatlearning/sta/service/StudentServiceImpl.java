package com.greatlearning.sta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.sta.model.Student;
import com.greatlearning.sta.repository.StudentJpaRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private final StudentJpaRepository studentRepository;
	
	public StudentServiceImpl(StudentJpaRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> viewAllStudents() {
	List<Student> students = this.studentRepository.findAll();
		return students;
	}

	@Override
	public Student CreateStudent(Student student) {
		
		return this.studentRepository.save(student);
	}

	@Override
	public Student updateStudent(long id, Student student) {
		Optional<Student> student1 = this.studentRepository.findById(id);
		if(student1.isPresent()) {
			Student tempStudent = student1.get();
			tempStudent.setFirstName(tempStudent.getFirstName());
			tempStudent.setLastName(tempStudent.getLastName());
			tempStudent.setCourse(tempStudent.getCourse());
			tempStudent.setCountry(tempStudent.getCountry());
			return studentRepository.save(tempStudent);
		}
		throw new IllegalArgumentException("Invalid id passed");
	}

	

	@Override
	public void deleteStudent(Long id) {
		this.studentRepository.deleteById(id);
		
	}

}
