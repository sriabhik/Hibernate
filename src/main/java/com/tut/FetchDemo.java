package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		//get method
		Student student = (Student)session.get(Student.class, 32);
		Address address = (Address)session.get(Address.class, 1);
		System.out.println(student);
		System.out.println(address);
		session.close();
		factory.close();
	}
}
