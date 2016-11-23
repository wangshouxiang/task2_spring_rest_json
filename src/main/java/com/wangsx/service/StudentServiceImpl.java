package com.wangsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wangsx.dao.StudentMapper;
import com.wangsx.daomain.Student;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	public Student selectStudentById(int id) {
		
		return studentMapper.selectStudentById(id);
	}

	public void insertStudent(Student student) {
		
		studentMapper.insertStudent(student);
	}

	public void deleteStudentById(int id) {
		
		studentMapper.deleteStudentById(id);
	}

	public void updateStudentById(Student student) {
		
		studentMapper.updateStudentById(student);
	}
	
}
