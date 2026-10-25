package com.karthikeya.StudentPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthikeya.StudentPortal.Service.StudentService;
import com.karthikeya.StudentPortal.model.Student;



@RestController
@RequestMapping("/Student")
public class StudentController{
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/wel")
	 String welcome(){
		return "Welcome to most easy concpet of SpringBoot";
		
	}
	@GetMapping("/getAllStudents")
	List<Student> getAllStudents() {
		return  studentService.getAllstudents();
	
	}
	
	@GetMapping("/getStudents/{Sid}")
	Student getStudent(@PathVariable Integer Sid){
		return studentService.getStudentById(Sid);
		
	}
	@GetMapping("/getStudentFirstName/{FirstName}")
	Student getStudentByFirstName(@PathVariable String FirstName ) {
		return studentService.getStudentByFirstName(FirstName);
		
	}
			
	@PostMapping("/ss")
	 Student CreateStudent(@RequestBody Student s){
		return studentService.Createstudent(s);
		
		
		
	}
}
