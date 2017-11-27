package com.ruimin.oadsp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruimin.oadsp.core.AbstractService;
import com.ruimin.oadsp.dao.StudentMapper;
import com.ruimin.oadsp.model.Student;
import com.ruimin.oadsp.model.Userinfo;
import com.ruimin.oadsp.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
	@Resource
	private StudentMapper studentmapper;
	
	public List selectAllstudent(Student student){
		return studentmapper.selectAllstudent(student);
	}
	
	public int delectByGraceid(int graceid){
		return studentmapper.delectByGraceid(graceid);
	}
	
	public int addstudent(Student student){
		return studentmapper.addStudent(student);
	}
	
	public int updateStudent(Student student)
	{
		return studentmapper.updateStudent(student);
	}
	}
