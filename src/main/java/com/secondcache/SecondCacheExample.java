package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;
public class SecondCacheExample {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();
		Student s1 = session1.get(Student.class, 132);
		System.out.println(s1);
		session1.close();
		
		Session session2 = factory.openSession();
		
		Student s2 = session2.get(Student.class, 132);
		System.out.println(s2);
		session2.close();
	}

}
