package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface StudentService {

	public Student saveData(Student s);

	public Iterable<Student> getSdata();

}
