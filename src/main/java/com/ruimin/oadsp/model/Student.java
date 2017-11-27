package com.ruimin.oadsp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Table(name = "student")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int  graceid;
	private String studentname;
	private String studentpwd;
	
	
	    

}
