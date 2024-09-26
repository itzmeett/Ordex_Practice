package com.student.managment.controller;

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

import com.student.managment.dto.StudentDto;
import com.student.managment.entity.StudentEntity;
import com.student.managment.services.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public StudentEntity addStudent(@RequestBody StudentDto studentDto) {
		
		StudentEntity saveStudent = service.saveStudent(studentDto);
		return saveStudent;
	}
	
	@DeleteMapping("/delete/{deleteId}")
	public void deleteStudent(@PathVariable Long deleteId) {
		service.deleteStudentById(deleteId);
	}
	
	@GetMapping("/getAll")
	public List<StudentEntity> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/get/{fetchId}")
	public StudentEntity getingSingleStudent(@PathVariable Long fetchId) {
		return service.getSingleStudent(fetchId);
	}
	
	@PutMapping("/update/{updateId}")
	public StudentEntity updatingStudent(@PathVariable Long updateId, @RequestBody StudentDto studentDto) {
		
		return service.updateStudent(updateId, studentDto);
	}
}
