package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {

	public static void main(String[] args) {
			
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		//creating question
		Question q1 = new Question();
		q1.setQuestionId(1);
		q1.setQuestion("Explain java?");
		
		
		Answer ans = new Answer();
		ans.setAnswerId(11);
		ans.setAnswer("Programming Lan");
		
		ans.setQues(q1);
		q1.setAnswer(ans);
		
		session.save(q1);
		session.save(ans);
		
		Question q2 = new Question();
		q2.setQuestionId(2);
		q2.setQuestion("Abhishek?");
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(22);
		ans1.setAnswer("srishti");
		ans1.setQues(q2);
		q2.setAnswer(ans1);
		
		session.save(q2);
		session.save(ans1);
		
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		session.close();
		
		factory.close();
	}

}
