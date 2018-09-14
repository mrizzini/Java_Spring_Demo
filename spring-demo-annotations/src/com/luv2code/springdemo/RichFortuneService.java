package com.luv2code.springdemo;

public class RichFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will be rich";
	}

}
