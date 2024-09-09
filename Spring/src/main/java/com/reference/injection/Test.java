package com.reference.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ref_config.xml");
		Person p1 = (Person)context.getBean("ref2");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAd().getCity());
	}

}
