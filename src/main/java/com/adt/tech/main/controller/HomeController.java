package com.adt.tech.main.controller;

//In this we have completed complete  SpringBoot CRUD using HIBERNATE & POSTMAN 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.adt.tech.main.model.Student;
import com.adt.tech.main.serviceimplementation.StudentServiceImpl;

@RestController

//we are using postman to do operations for that we need to add cross origin annotation 
@CrossOrigin("*")

public class HomeController { 
    
	//To create bean of implementation class 
	@Autowired
	private StudentServiceImpl studentServiceImpl; 
	
	//to call save method or to save new student 
	
	@PostMapping(value="saveStudent")
	public Student saveStudent (@RequestBody Student student)
	{
		//lets try if it works (run)
		System.out.println("Student Save Works Properly !!!");
		
		studentServiceImpl.saveStudent(student);
		
		return student;
		//now open postman to hit API(INSERT AND SAVE DATA IN DATABASE)
		//in this way new student registration is done
	}
	
	//now lets try to find all students from db
	@GetMapping(value ="getAllStudent")
	public List<Student> findAllStudent()
	{
		return studentServiceImpl.findAllStudent();
		//save it
		//open postman & now read the data 
	}
	
	//now try to update student
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentServiceImpl.updateStudent(student);
		//open postman & now update the data 
	}

	//now try to delete
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id)
	{
		studentServiceImpl.deleteStudent(id);
		return "Student Deleted !!!";
		//open postman & now delete existing the data 
	}
}

