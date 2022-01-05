package com.mapcopy;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer_1 {
	
	@Id 
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Question_1 ques;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question_1 getQues() {
		return ques;
	}

	public void setQues(Question_1 ques) {
		this.ques = ques;
	}

	public Answer_1(int answerId, String answer, Question_1 ques) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.ques = ques;
	}

	public Answer_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}

