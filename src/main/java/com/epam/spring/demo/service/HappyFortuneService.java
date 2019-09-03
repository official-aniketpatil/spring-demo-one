package com.epam.spring.demo.service;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "today is your lucky day";
	}
	
}
