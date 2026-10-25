package com.karthikeya.StudentPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthikeya.StudentPortal.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Student findByFirstName(String FirstName);




}