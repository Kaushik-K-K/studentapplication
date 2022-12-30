package com.hexagonal.studentapplication.port;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.studentapplication.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

//	public Student addStudent(Student student); 
}
