package com.epam.spring.demo;

import com.epam.spring.demo.service.FortuneService;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "do batting for half hour and bowling for half hour";
	}

}
