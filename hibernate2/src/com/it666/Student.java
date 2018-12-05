package com.it666;
//4566
import java.util.HashSet;
import java.util.Set;

public class Student {
	private Integer sid;
	private String sname;
	private String sex;
	private Set<Teacher> teacher;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Set<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
	public Student(String sname, String sex) {
		this();
		this.sname = sname;
		this.sex = sex;
	}
	public Student() {
		teacher =new HashSet<Teacher>();
	}
	

	
}