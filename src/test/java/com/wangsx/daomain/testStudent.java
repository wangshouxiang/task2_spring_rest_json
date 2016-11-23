package com.wangsx.daomain;

import java.io.*;
import java.text.*;
import java.util.Date;
import org.apache.log4j.*;
import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.wangsx.dao.StudentMapper;
import com.wangsx.daomain.*;
import com.wangsx.service.StudentService;


public class testStudent extends SpringTestCase{
	
	@Autowired
	private StudentService studentService;
	@Test
	public void selectUserById() {
		Student student = studentService.selectStudentById(1);
		System.out.println(student.getStudentName() + ":" + student.getStudentAge());
		
	}
	
	/*private static SqlSessionFactory sqlSessionFactory;
	private Logger logger = Logger.getLogger(this.getClass());
	
	@BeforeClass
	public static void setUp(){
	    String resource = "mybatis/mybatis-config.xml";
	    try {
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void selectStudentById() {
		SqlSession session = sqlSessionFactory.openSession();
		logger.info("打印日志: ");
		try{
			StudentMapper studentOperation = session.getMapper(StudentMapper.class);
			Student student = studentOperation.selectStudentById(1);
			System.out.println(student.getStudentName());
			SimpleDateFormat sdFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			Date date = new Date(student.getCreateAt());
			String dateTime = sdFormat.format(date);
			System.out.println(dateTime);
		}
		 catch (Exception e) {
		      e.printStackTrace();
		 } finally{
		      session.close();
		 }
	}*/
	
	/*@Test
	public void insertStudent() {
		
		Student student = new Student();
		student.setStudentAge(26);
		student.setCreateAt(new Date().getTime());
		student.setStudentName("wangsx2");
		student.setStudentProfession("s");
		student.setUpdateAt(new Date().getTime());
		SqlSession session = sqlSessionFactory.openSession();
		logger.info("打印日志: ");
		try{
			//参数：映射文件的命名空间+sql语句id
			StudentMapper studentOperation = session.getMapper(StudentMapper.class);
			studentOperation.insertStudent(student);
			session.commit();
			System.out.println(student.getStudentName());
		 }
		 catch (Exception e) {
		      e.printStackTrace();
		 } finally{
		      session.close();
		 }
	}*/
	/*@Test
	public void deleteStudentById() {
		
		SqlSession session = sqlSessionFactory.openSession();
		logger.info("打印日志: ");
		try{
			StudentMapper studentOperation = session.getMapper(StudentMapper.class);
			studentOperation.deleteStudentById(3);
			session.commit();
		 }
		 catch (Exception e) {
		      e.printStackTrace();
		 } finally{
		      session.close();
		 }
	}*/
	/*@Test
	public void updateStudentById() {
		
		SqlSession session = sqlSessionFactory.openSession();
		logger.info("打印日志: ");
		try{
			StudentMapper studentOperation = session.getMapper(StudentMapper.class);
			Student student = studentOperation.selectStudentById(3);
			student.setStudentAge(22);
			studentOperation.updateStudentById(student);
			session.commit();
			System.out.println(student.getStudentAge());
		 }
		 catch (Exception e) {
		      e.printStackTrace();
		 } finally{
		      session.close();
		 }
	}*/
}
