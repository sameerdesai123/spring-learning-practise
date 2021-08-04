package com.sameer.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are in same mem location
		System.out.println("\nPointing to same object: " + (theCoach == alphaCoach));
		System.out.println("\nMem location of theCoach: " + theCoach);
		System.out.println("\nMem location of alphaCoach: " + alphaCoach);
		
		context.close();
		
	}

}
