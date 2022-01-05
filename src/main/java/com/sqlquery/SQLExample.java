package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		String query = "Select * from Student";
		NativeQuery nq=s.createSQLQuery(query);
		
		List<Object []> list = nq.list();//as we are fecthing data from table,must object in generics
		for(Object[] st:list) {
			System.out.println(Arrays.toString(st));
		}
		s.close();
		factory.close();

	}

}
