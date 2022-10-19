package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
