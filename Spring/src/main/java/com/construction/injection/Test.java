package com.construction.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("construction_config.xml");
//		Person p1 = (Person)context.getBean("person1");
//		Certificate c1 = (Certificate)context.getBean("certificate1");
		Addition d1 = (Addition)context.getBean("add");
		d1.doSum();
//		System.out.println(d1);
//		System.out.println(p1);
//		System.out.println(p1.getCerti().getName());
//		System.out.println(c1);
	}

}
