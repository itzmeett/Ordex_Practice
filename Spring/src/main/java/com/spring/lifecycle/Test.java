package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_lifecycle_config.xml"); 
//		Engine engine1 = (Engine)context.getBean("e1");
//		System.out.println(engine1);
		context.registerShutdownHook();
		
		Question question1 = (Question)context.getBean("q1");
		System.out.println(question1);
		
	}

}
