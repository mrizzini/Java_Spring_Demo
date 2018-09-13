package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		// this line will work with any coach implementation
		System.out.println(theCoach.getDailyWorkout());
	}

}
