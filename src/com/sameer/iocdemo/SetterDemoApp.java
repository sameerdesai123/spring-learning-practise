package com.sameer.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load xml config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrive bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close cxt
		context.close();

	}

}
