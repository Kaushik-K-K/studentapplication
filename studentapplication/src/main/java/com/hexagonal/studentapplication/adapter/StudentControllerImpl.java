package com.hexagonal.studentapplication.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.studentapplication.domain.Student;
import com.hexagonal.studentapplication.port.StudentController;
import com.hexagonal.studentapplication.port.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentControllerImpl implements StudentController {
	
	@Autowired
	private StudentService studentService;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentService.getAllStudents();
	}

	@Override
	public Student addStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentService.addStudentDetails(student);
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}

	@Override
	public Student updateStudent(int id, Student stu) {
		// TODO Auto-generated method stub
		stu.setId(id);
		return studentService.updateStudent(stu);
	}
	
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentService.deleteStudent(id);
	}
	
}
