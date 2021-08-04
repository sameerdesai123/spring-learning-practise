package com.sameer.iocdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Today is your lucky day!", "You won $500!", "Take a day off!"};
	
	@Override
	public String getFortune() {
		Random rand = new Random();
		String fortune = this.fortunes[rand.nextInt(this.fortunes.length)];
		return fortune;
	}


}
