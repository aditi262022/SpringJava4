package com.gqt.p1;

import java.util.Iterator;
import java.util.List;

public class Questions {
	int ques_no;
	String question;
	List<String> answers;
	
	public int getQues_no() {
		return ques_no;
	}
	public void setQues_no(int ques_no) {
		this.ques_no = ques_no;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void display(){
		System.out.println(ques_no);
		System.out.println(question);
		Iterator<String> iterator = answers.iterator();
		while(iterator.hasNext()==true){
			System.out.println(iterator.next());
		}
	}
	
}
