package com.firstcache;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Student s1 = s.get(Student.class, 132);
		System.out.println(s1);
		System.out.println("Working Something.....");
		Student s2 = s.get(Student.class, 132);
		System.out.println(s2);
	}

}
