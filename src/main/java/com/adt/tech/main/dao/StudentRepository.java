package com.adt.tech.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adt.tech.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student ,Integer> {

}
 