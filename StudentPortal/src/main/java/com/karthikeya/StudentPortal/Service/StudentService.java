package com.karthikeya.StudentPortal.Service;

import java.util.List;

import com.karthikeya.StudentPortal.model.Student;

public interface StudentService{
	
	public abstract Student Createstudent(Student s);
	
	 List<Student> getAllstudents();
	 
	 Student getStudentById(Integer Sid);
	 
	 Student updateStudent(Integer Sid);
	 
	 void  deleteStudentById(Integer Sid);
	 
	 Student getStudentByFirstName(String FirstName);

	
}