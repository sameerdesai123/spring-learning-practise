package com.sameer.iocdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		super();
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Prepare for yoyo test!";
	}

	@Override
	public String getDailyFortune() {
		return "Fortune: " + fortuneService.getFortune();
	}
	
	// init-method
	public void init() {
		System.out.println("Cricket Coach: INIT method");
	}

	// destroy-method
	public void destroy() {
		System.out.println("Cricket Coach: Destroy method");
	}
}
