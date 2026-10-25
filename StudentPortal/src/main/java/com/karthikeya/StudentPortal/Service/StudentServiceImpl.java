package com.karthikeya.StudentPortal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthikeya.StudentPortal.Repo.StudentRepository;
import com.karthikeya.StudentPortal.model.Student;

@Service
public  class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;

	@Override
	public Student Createstudent(Student s) {
		return studentRepo.save(s);
	}

	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Integer Sid) {
		return studentRepo.findById(Sid).orElseThrow();
	}

	@Override
	public Student updateStudent(Integer Sid) {
		return null;
	}

	@Override
	public void deleteStudentById(Integer Sid) {

	}

	@Override
	public Student getStudentByFirstName(String FirstName) {
	    return studentRepo.findByFirstName(FirstName);
	}
}
