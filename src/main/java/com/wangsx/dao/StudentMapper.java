package com.wangsx.dao;

import org.apache.ibatis.annotations.*;

import com.wangsx.daomain.*;

public interface StudentMapper {
	
	@Select("select student_id as studentId,student_name as studentName,"
			+ "student_age as studentAge,student_profession as studentProfession,"
			+ "create_at as createAt, update_at as updateAt from student "
			+ "where student_id=#{id}")
	public Student selectStudentById(int id);
	
	@Insert("insert into student(student_name,student_age,student_profession,create_at,update_at)"
			+  "values(#{studentName},#{studentAge},#{studentProfession},#{createAt},#{updateAt})")
	public void insertStudent(Student student);
	
	@Delete("delete from student where student_id=#{id}")
	public void deleteStudentById(int id);
	
	@Update("update student set student_name=#{studentName},student_age=#{studentAge},"
			+ "student_profession=#{studentProfession},update_at=#{updateAt} "
			+ "where student_id=#{studentId}")
	public void updateStudentById(Student student);
}
