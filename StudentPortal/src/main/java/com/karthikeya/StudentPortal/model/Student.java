package com.karthikeya.StudentPortal.model;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@RequestMapping
@Entity
@Table(name = "Karthik")
//@Setter
//@Getter
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Sid;
	String FirstName;
	String LastName;
	String Email;
	String Dept;
	double Salary;
	String City;

}
