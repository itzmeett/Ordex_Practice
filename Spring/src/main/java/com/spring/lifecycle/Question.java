package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Question /*implements InitializingBean, DisposableBean*/ {
	private int qid;
	private String question;

	public int getQid() {
		System.out.println("getting qid");
		return qid;
	}

	public void setQid(int qid) {
		System.out.println("setting qid");
		this.qid = qid;
	}

	public String getQuestion() {
		System.out.println("getting question");
		return question;
	}

	public void setQuestion(String question) {
		System.out.println("setting question");
		this.question = question;
	}

/*	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Qestion in : init()");
	}

	public void destroy() throws Exception {
		System.out.println("Question in : destroy()");
	}*/

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Using annotation : init()");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Using annotation : destroy()");
	}
	
	
}
