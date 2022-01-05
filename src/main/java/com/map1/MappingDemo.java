package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(1);
		e1.setName("Kin");
		
		e2.setEid(2);
		e2.setName("Srisht");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(11);
		p1.setProjectname("We");
		
		p2.setPid(22);
		p2.setProjectname("ChatBox");
				
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		e1.setProjects(list2);
		p2.setEmps(list1);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		factory.close();

	}

}
