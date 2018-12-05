package com.it666;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	
	private Integer tid;
	private String tname;
	private Integer tage;
	private Set<Student> student;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	public Teacher(String tname, Integer tage) {
		this();
		this.tname = tname;
		this.tage = tage;
	}
	public Teacher() {
		student = new HashSet<Student>();
	}
	
}
