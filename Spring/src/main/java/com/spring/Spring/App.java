package com.spring.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");
		
		System.out.println(person1);
		System.out.println(person2);
	}
}
