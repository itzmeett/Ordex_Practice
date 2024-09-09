package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("collection_config.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		
		System.out.println(e1.getName());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getMobile_nos());
	}

}
