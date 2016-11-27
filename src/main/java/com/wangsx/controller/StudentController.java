package com.wangsx.controller;

import java.util.Date;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.daomain.Student;
import com.wangsx.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	@Resource
	private StudentService studentService;
	@RequestMapping(value="/selectStudentById/{id}", method=RequestMethod.GET) 
	public ModelAndView selectStudentById(@PathVariable int id) {
		ModelAndView maView = new ModelAndView();
		Student student = studentService.selectStudentById(id);
		maView.addObject("student", student);   
		maView.setViewName("index");
		return maView;   
	}
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public ModelAndView insertStudent() {
		ModelAndView modelAndView = new ModelAndView();
		Student student = new Student();
		student.setStudentAge(26);
		student.setCreateAt(new Date().getTime());
		student.setStudentName("wangsx3");
		student.setStudentProfession("s");
		student.setUpdateAt(new Date().getTime());
		studentService.insertStudent(student);
		modelAndView.addObject("student", student);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	@RequestMapping(value="/updateStudentById/{id}/{profession}", method=RequestMethod.PUT)
	public ModelAndView updateStudentById(@PathVariable int id,@PathVariable String profession) {
		ModelAndView maView = new ModelAndView();
		Student student = studentService.selectStudentById(id);
		student.setStudentProfession(profession);
		maView.addObject("student", student);
		studentService.updateStudentById(student);
		maView.setViewName("index");
		return maView;   
	}
}
