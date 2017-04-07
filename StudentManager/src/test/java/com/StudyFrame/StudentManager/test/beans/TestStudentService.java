package com.StudyFrame.StudentManager.test.beans;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.StudyFrame.StudentManager.beans.Student;
import com.StudyFrame.StudentManager.service.IStudentService;

public class TestStudentService {
	private ApplicationContext ac;
	private IStudentService iss;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:NewFile.xml");
		iss=(IStudentService) ac.getBean("StudentServiceImpl");
	}
	
	@Test
	public void testAddStudent(){
		Student stu=new Student(1,"小红",18);
		iss.addStudent(stu);
	}
}
