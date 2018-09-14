package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email2}")
	private String email;
	
	@Value("${foo.team2}")
//	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 100 free throws";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
