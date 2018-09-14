package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketballJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config files
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig2.class);
		
		// get the bean from spring container
		BasketballCoach theCoach = context.getBean("basketballCoach", BasketballCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods...has the props values injected
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
		
	}

}
