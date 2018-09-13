package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method - will execute when bean is being created
	public void doMyStartUpStuff() {
		System.out.println("Track Coach: inside method doMyStartUpStuff");
	}
	
	// add a destroy method - will execute when bean is being destroyed
	public void doMyCleanUpStuff() {
		System.out.println("Track Coach: inside method doMyCleanUpStuff");
	}
}
