package com.sameer.iocdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleAppDemo {

	public static void main(String[] args) {
		// Load xml config file5
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");
				
				// Retrive bean from container
				CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
				
				// call methods
				
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				System.out.println(theCoach.getEmailAddress());
				System.out.println(theCoach.getTeam());
				
				// close cxt
				context.close();

	}

}
