package com.adt.tech.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adt.tech.main.dao.StudentRepository;
import com.adt.tech.main.model.Student;
import com.adt.tech.main.serviceinterface.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	
}
