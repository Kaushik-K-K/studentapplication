package com.hexagonal.studentapplication.port;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.hexagonal.studentapplication.domain.Student;

@Component
public interface StudentService {

	public List<Student> getAllStudents();
	public Student addStudentDetails(Student stu);
	public Optional<Student> getStudentById(int id);
	public Student updateStudent(Student stu);
	public void deleteStudent(int id); 
}
