package com.cascade;

import java.util.*;


import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;
import com.mapcopy.Answer_1;
import com.mapcopy.Question_1;

public class CascadeExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Question_1 q1 = new Question_1();
		q1.setQuestionId(25);
		q1.setQuestion("What is hibernate?");
		Answer_1 ans1 = new Answer_1();
		ans1.setAnswerId(123);
		ans1.setAnswer("Hibernate");
		Answer_1 ans2 = new Answer_1();
		ans2.setAnswerId(214);
		ans2.setAnswer("second");
		Answer_1 ans3 = new Answer_1();
		ans3.setAnswerId(213);
		ans3.setAnswer("third");
		
		List<Answer_1>list = new ArrayList<Answer_1>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		q1.setAnswer(list);
//		ans1.setQues(q1);
//		ans2.setQues(q1);
//		ans3.setQues(q1);	
		Transaction tx = s.beginTransaction();
//		
  		s.save(q1);
//		s.save(ans1);
//		s.save(ans2);
//		s.save(ans3);
		tx.commit();
		s.close();
	}

}
