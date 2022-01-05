package com.mapcopy;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question_1 {
	@Id
	private int questionId;
	private String question;
	@OneToMany(mappedBy = "ques",fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	private List<Answer_1>  answer;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer_1> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer_1> answer) {
		this.answer = answer;
	}
	public Question_1(int questionId, String question, List<Answer_1> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public Question_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question_1 [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	

	
	
}
