package com.wangsx.service;

import com.wangsx.daomain.*;

public interface StudentService {
	
	public Student selectStudentById(int id);
	public void insertStudent(Student student);
	public void deleteStudentById(int id);
	public void updateStudentById(Student student);
}
