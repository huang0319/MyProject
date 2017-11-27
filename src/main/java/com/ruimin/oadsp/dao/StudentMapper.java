package com.ruimin.oadsp.dao;

import java.util.List;

import com.ruimin.oadsp.core.Service;
import com.ruimin.oadsp.model.Student;
import com.ruimin.oadsp.core.Mapper;

public interface StudentMapper extends Mapper<Student> {
	public List selectAllstudent(Student student);
	public int delectByGraceid(int graceid);
	public int addStudent(Student student);
	public int updateStudent(Student student);
     
}
