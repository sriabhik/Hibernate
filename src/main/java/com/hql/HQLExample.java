package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;//new feature
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {
    public static void main(String[] args) {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		//HQL Syntax
		String query  = "from Student ";
		Query q  = s.createQuery(query);
		//q.setParameter("x", "Patna");
		//q.setParameter("y", "Priya");
		//single result(Unique)
		//mutiple result (list)
		List<Student> list = q.list();
		for(Student s1 : list) {
			System.out.println(s1.getName()+ " "+s1.getCity());
		}
		Transaction tx = s.beginTransaction();
//		//Delete
//		
//		Query q2 = s.createQuery("delete from Student where city='kota' ");
//		int r = q2.executeUpdate();
//		System.out.println("Deleted : "+ r);
		
		//Update
		Query q2  = s.createQuery("update Student set city=:c where name=:n");
		q2.setParameter("c","chhapra");
		q2.setParameter("n","Priya");
		int r = q2.executeUpdate();
		System.out.println(r+ "Objects updated");
		
		
		//Execute Join
//		Query q4 = s.createQuery("select q.question,q.questionId,a.answer from Question_1 as q INNER JOIN q.answers as a ");
//		List<Object []>list5 =q4.getResultList();
//		for(Object[] arr:list5) {
//			System.out.println(Arrays.toString(arr));
//		}
		tx.commit();
		s.close();
		factory.close();
    }
}
