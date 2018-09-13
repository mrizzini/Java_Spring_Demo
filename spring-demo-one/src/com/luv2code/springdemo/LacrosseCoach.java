package com.luv2code.springdemo;

public class LacrosseCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public LacrosseCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Give me 50 corners";
	}

	@Override
	public String getDailyFortune() {
		return "Rabil says: " + fortuneService.getFortune();
	}

}
