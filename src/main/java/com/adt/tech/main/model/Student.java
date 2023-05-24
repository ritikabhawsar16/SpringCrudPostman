package com.adt.tech.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table",catalog="student_database")
public class Student {
	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@Id
//  @SequenceGenerator()
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "pid_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)

	private int id;
	private int roll;
	private String name;	
	private String address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Run application if db connection is properly done or not

	public Student(int id, int roll, String name, String address) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
