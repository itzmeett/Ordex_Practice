package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring_config.xml");
		Person p1 = (Person)context.getBean("ad");
//		Person p2 = (Person)context.getBean("ad2");
		Address a1 = (Address)context.getBean("address1");
//		Address a1 = context.getBean("address", Address.class);
		
		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1.getAd().getCity());
		
		
//		System.out.println(a1);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAd().getCity());
	}

}
