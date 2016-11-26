package com.wangsx.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wangsx.daomain.Student;
import com.wangsx.service.StudentService;

@Controller
public class StudentController {
	@Resource
	private StudentService studentService;
	@RequestMapping("/") 
	public ModelAndView getStudent() {
		ModelAndView maView = new ModelAndView("index");
		Student student = studentService.selectStudentById(1);
		maView.addObject("student", student);   
        return maView;   
	}
}
