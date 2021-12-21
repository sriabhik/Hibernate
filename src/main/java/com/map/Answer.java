package com.map;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id 
	private int answerId;
	private String answer;
	
	@OneToOne
	private Question ques;

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

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	public Answer(int answerId, String answer, Question ques) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.ques = ques;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
