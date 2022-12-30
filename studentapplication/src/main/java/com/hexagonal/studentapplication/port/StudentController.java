package com.hexagonal.studentapplication.port;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexagonal.studentapplication.domain.Student;

public interface StudentController {
	
	@GetMapping
	public List<Student> getAllStudents();
	
	@PostMapping
	public Student addStudentDetails(@RequestBody Student student);
	
	@GetMapping("/{id}")
	public Optional<Student> getStudentById(@PathVariable int id);
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student stu);
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id);
	
}
