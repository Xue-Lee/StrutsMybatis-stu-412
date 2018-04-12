package com.icss.dao;

import java.util.List;

import com.icss.entity.Student;

public interface StudentDao {
	public Student login(String stuId,String stuName);
	public List<Student>findStuAll();
	public List<Student>findStuBySex(String sex);
	public List<Student>findStuBySexGrade(String sex,Integer grade);
	public List<Student>findStuBySexGrade1(Student stu);
}
