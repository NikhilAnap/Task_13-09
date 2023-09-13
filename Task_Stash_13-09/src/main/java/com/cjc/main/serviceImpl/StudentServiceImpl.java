package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveData(Student s) {
	  
		
		return sr.save(s);
		
	}

	@Override
	public Iterable<Student> getSdata() {
		
		
		return sr.findAll();
	}

}
