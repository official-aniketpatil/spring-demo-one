package com.epam.spring.demo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

}
