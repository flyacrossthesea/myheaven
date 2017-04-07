package com.StudyFrame.StudentManager.service.impl;

import com.StudyFrame.StudentManager.beans.Student;
import com.StudyFrame.StudentManager.dao.IStudentDao;
import com.StudyFrame.StudentManager.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;	
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.addStudent(student);
	}

}
