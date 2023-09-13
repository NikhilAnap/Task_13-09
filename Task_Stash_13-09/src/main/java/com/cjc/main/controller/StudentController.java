package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService ss;

	@PostMapping("/saveData")
	public ResponseEntity<Student> saveData(@RequestBody Student s) {

		     Student stu= ss.saveData(s);

		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);

	}
	
	
   @GetMapping("/getallData")
   public ResponseEntity<Iterable<Student>>getallData(){
	
	   Iterable<Student>st=ss.getSdata();
	   
	   return new ResponseEntity<Iterable<Student>>(st, HttpStatus.OK);
	   
	   
	   
   }

}
