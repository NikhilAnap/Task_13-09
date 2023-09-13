package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository sr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}

}
