package com.it666;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;



public class test {
	
	/*@Test
	public void test1()
	{
		Session session = HibernateUtil.getCurrentSession();
		Transaction beginTransaction = session.beginTransaction();
		
		Teacher teacher = new Teacher("11",28);
		Student student = new Student("22","男");
		Student student2 = new Student("33","女");
		teacher.getStudent().add(student2);
		teacher.getStudent().add(student);
		
		
		session.save(teacher);
	
		beginTransaction.commit();
			
	}*/
		
	@Test
	public void test02()
	{
		Session session = HibernateUtil.getCurrentSession();
		Transaction beginTransaction = session.beginTransaction();
		Teacher teacher = session.get(Teacher.class, 1);
		Set<Student> students = teacher.getStudent();
		Student student = session.get(Student.class, 1);
		
		students.remove(student);
		
		
		
	
		beginTransaction.commit();
		
	}
}
