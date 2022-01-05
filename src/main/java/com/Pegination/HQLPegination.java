package com.Pegination;

import org.hibernate.query.*;

import com.tut.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPegination {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Query query = s.createQuery("from Student");
	
		//implementing Pegination ::
		query.setFirstResult(0);//set row
		query.setMaxResults(3);//set max row need to fetch
		List<Student> list =query.list();
		for(Student st:list) {
			System.out.println(st.getId()+" "+st.getName()+" "+st.getCity());
		}
		s.close();
		factory.close();
	}

}
