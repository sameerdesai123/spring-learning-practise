package com.sameer.iocdemo;

public class BaseballCoach implements Coach {

	// define a private field for fortune service
	private FortuneService fortuneService;
	
	// constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practise";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return this.fortuneService.getFortune();
	}

}
