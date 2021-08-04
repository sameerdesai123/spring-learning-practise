package com.sameer.iocdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
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
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("----- Setting email address");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("----- Setting team");
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
		return "Go Cricket! " + fortuneService.getFortune();
	}

}
