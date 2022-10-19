package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Student;
import com.ibm.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	@Override
	public int addStudent(Student s) {
		repo.save(s);
		return s.getRoll();
	}

	@Override
	public boolean delStudent(int roll) {
		repo.deleteById(roll);
		return true;
	}

	@Override
	public Student findStudent(int roll) {
		return repo.findById(roll).get();
	}

	@Override
	public List<Student> list() {
		return repo.findAll();
	}

}
