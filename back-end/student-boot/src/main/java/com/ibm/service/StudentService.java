package com.ibm.service;

import java.util.List;

import com.ibm.entity.Student;

public interface StudentService {
	int addStudent(Student s);
	
	boolean delStudent(int roll);
	
	Student findStudent(int roll);
	
	List<Student> list();
}
