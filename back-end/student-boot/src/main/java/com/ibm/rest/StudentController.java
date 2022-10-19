package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Student;
import com.ibm.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value="add",consumes="application/json")
	public String saveStudent(@RequestBody Student s) {
		service.addStudent(s);
		return "Student with roll: "+s.getRoll()+" has been added.";
	}
	
	@GetMapping(value="get/{roll}",produces = "application/json")
	public Student getFlight(@PathVariable int roll) {
		return service.findStudent(roll);
	}
	
	@GetMapping(value="getList",produces="application/json")
	public List<Student> getList(){
		return service.list();
	}
	
	@DeleteMapping(value="delete/{roll}")
	public String delStudent(@PathVariable int roll) {
		service.delStudent(roll);
		return "Student with roll: "+roll+"has been deleted.";
	}
}
