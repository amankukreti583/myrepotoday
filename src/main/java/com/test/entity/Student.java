package com.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Student {
	@Column
	private int sid;
	@Column
	private String studentName;
	@Column
	private String sgender;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String studentName, String sgender) {
		super();
		this.sid = sid;
		this.studentName = studentName;
		this.sgender = sgender;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getSgender() {
		return sgender;
	}


	public void setSgender(String sgender) {
		this.sgender = sgender;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", sgender=" + sgender + "]";
	}
	

}
