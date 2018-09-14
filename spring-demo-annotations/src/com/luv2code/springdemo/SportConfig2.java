package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig2 {

	// define bean for our rich fortune service
	// method name is the  actual bean id
	@Bean
	public FortuneService richFortuneService() {
		return new RichFortuneService();
	}
	
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach basketballCoach() {
		return new BasketballCoach(richFortuneService());
	}
	
	
}
