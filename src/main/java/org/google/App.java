package org.google;

import java.util.ArrayList;
import java.util.List;

import org.google.bean.Department;
import org.google.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionfactory.openSession();
		Transaction tn = session.beginTransaction();

		Student student1 = new Student();
		student1.setStudentRollNo(201);
		student1.setStudentMobileNummber(9326954);
		student1.setStudentName("Samtosh");

		Student student2 = new Student();
		student2.setStudentRollNo(202);
		student2.setStudentMobileNummber(9326954);
		student2.setStudentName("Rohan");

		ArrayList<Student> list1 = new ArrayList<Student>();

		list1.add(student1);
		list1.add(student2);

		
		Department department1 = new Department();
		department1.setDept_Id(101);
		department1.setDeptName("IT");
		department1.setStudentList(list1);
		student1.setDepartment(department1);

		Department department2 = new Department();
		department2.setDept_Id(102);
		department2.setDeptName("BPO");
		department2.setStudentList(list1);
		student2.setDepartment(department2);

		session.save(department1);
		session.save(department2);
		session.save(student2);
		session.save(student1);
		session.flush();
		tn.commit();

		/*
		 * Student student=session.get(Student.class, 1); session.close();
		 * 
		 * 
		 * 
		 * Session sessiontemp=sessionfactory.openSession();
		 * sessiontemp.beginTransaction();
		 * 
		 * Student student1=sessiontemp.get(Student.class, 1); sessiontemp.close();
		 * 
		 * 
		 */

	}
}
