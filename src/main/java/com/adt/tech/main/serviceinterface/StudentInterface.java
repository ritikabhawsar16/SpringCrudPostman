package com.adt.tech.main.serviceinterface;

import java.util.List;

import com.adt.tech.main.model.Student;

public interface StudentInterface {

	//to save new student
	public Student saveStudent(Student student);
	
	//to update student
	public Student updateStudent(Student student);
	
	//to fetch all students from database
	public List<Student> findAllStudent();
	
	//to delete student
	public void deleteStudent(int id);
}
