package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo_1 {

	public static void main(String[] args) {
			
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		//creating question
		Question_1 q1 = new Question_1();
		q1.setQuestionId(1);
		q1.setQuestion("Explain java?");
		
		
		Answer_1 ans = new Answer_1();
		ans.setAnswerId(11);
		ans.setAnswer("Programming Lan");
		ans.setQues(q1);
	
		Answer_1 ans1 = new Answer_1();
		ans1.setAnswerId(12);
		ans1.setAnswer("DS");
		ans1.setQues(q1);
		
		Answer_1 ans2 = new Answer_1();
		ans2.setAnswerId(13);
		ans2.setAnswer("ALGO");
		ans2.setQues(q1);
		
		List<Answer_1> list = new ArrayList<Answer_1>();
		list.add(ans);
		list.add(ans2);
		list.add(ans1);
		
		q1.setAnswer(list);
		session.save(q1);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);
		
		
		
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		Question_1 qq = (Question_1)session.get(Question_1.class,1);
		System.out.print(qq);
		session.close();
		
		factory.close();
	}

}
