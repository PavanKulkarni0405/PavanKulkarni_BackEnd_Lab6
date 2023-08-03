package com.greatlearning.sta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.sta.model.Student;
import com.greatlearning.sta.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> viewAllStudents(){
		return this.studentService.viewAllStudents();
	}
	
	@PostMapping
	public Student createStudent(Student student) {
		return this.studentService.CreateStudent(student);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable long id, @RequestBody Student student) {
		return this.studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable long id) {
		this.studentService.deleteStudent(id);
	}
	
	

}
