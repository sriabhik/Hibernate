package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		 Transaction tx = s.beginTransaction();
		
        
       
        
		Student student1 = new Student();
		student1.setId(132);
        student1.setName("Abhishek Kumar Srivastava");
        student1.setCity("Chapra");
      
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("2 Months");
        
        student1.setCerti(certificate);
        
        Student student2 = new Student();
		student2.setId(130);
        student2.setName("Yuvraj Kumar Srivastava");
        student2.setCity("Bandel");
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("DBMS");
        certificate1.setDuration("1 Months");
        
        student2.setCerti(certificate1);
        
        Student student3 = new Student();
		student3.setId(1);
        student3.setName("Pawan Kumar Srivastava");
        student3.setCity("Kota");
      
        
        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Program");
        certificate2.setDuration("3 Months");
        //Object save
        s.save(student1);
        s.save(student2);
        s.save(student3);
        tx.commit();
        s.close();
		factory.close();
	}
}	
