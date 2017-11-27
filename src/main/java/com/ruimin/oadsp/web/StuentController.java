package com.ruimin.oadsp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruimin.oadsp.core.Result;
import com.ruimin.oadsp.core.ResultGenerator;
import com.ruimin.oadsp.model.Student;
import com.ruimin.oadsp.service.StudentService;
import com.ruimin.oadsp.service.impl.StudentServiceImpl;

@RequestMapping("/student")
public class StuentController {
	@Resource
	private StudentService studentservice;
	@Resource
	private StudentServiceImpl studentserviceimpl;
	
	@PostMapping("/add")
	public Result add(Student student){
		studentservice.save(student);
		return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/addstudent")
	public Result addstudent(Student student)
	{
		studentserviceimpl.addstudent(student);
		return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/delete")
    public Result delete(@RequestParam Integer graceid){
		studentservice.deleteById(graceid);
		return ResultGenerator.genSuccessResult();
	}	
	
	@PostMapping("/update")
	public Result delete(Student student)
	{
		studentservice.update(student);
		return ResultGenerator.genSuccessResult();
	}
	@PostMapping("/updatestudent")
	public Result updatestudent(Student student)
	{
		studentserviceimpl.updateStudent(student);
		return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/delectByGraceid")
	public Result delectByGraceid(int graceid)
	{
		studentserviceimpl.delectByGraceid(graceid);
		return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/detail")
	public Result detail(@RequestParam Integer graceid)
	{
	Student student=studentservice.findById(graceid);
	return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/list")
	public Result list(@RequestParam(defaultValue="0")Integer page, @RequestParam(defaultValue="0") Integer size)
	{
	PageHelper.startPage(page,size);
	List<Student> list=studentservice.findAll();
	PageInfo pageInfo = new PageInfo(list);
	return ResultGenerator.genSuccessResult(pageInfo);
	}
	
	@PostMapping("/selectAllstudent")
	public Result selectAll(@RequestParam(defaultValue="0" )Integer page, @RequestParam(defaultValue="0 ") Integer size)
	{
	 PageHelper.startPage(page,size);
	 List<Student> list=studentserviceimpl.selectAllstudent(null);
	 PageInfo pageInfo = new PageInfo(list);
	 return ResultGenerator.genSuccessResult(pageInfo);	
	}
	
	
}
