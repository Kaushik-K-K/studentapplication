package com.hexagonal.studentapplication.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonal.studentapplication.domain.Student;
import com.hexagonal.studentapplication.port.StudentRepo;
import com.hexagonal.studentapplication.port.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> stu = studentRepo.findAll();
		return stu;
	}

	@Override
	public Student addStudentDetails(Student stu) {
//		 TODO Auto-generated method stub
		Student student = studentRepo.save(stu);
		return student;
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		Student student = studentRepo.getById(stu.getId());
		student.setName(stu.getName());
		student.setSubject(stu.getSubject());
		student.setMark(stu.getMark());
		Student stud =studentRepo.save(student);
		return stud;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

}
