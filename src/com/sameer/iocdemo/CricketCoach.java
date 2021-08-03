package com.sameer.iocdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		super();
		System.out.println("------ Inside cricket coach constructor");
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		System.out.println("------ Inside cricket coach constructor");
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("----- Inside cricket coach setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Prepare for yoyo test!";
	}

	@Override
	public String getDailyFortune() {
		return "Go Cricket! " + fortuneService.getFortune();
	}

}
