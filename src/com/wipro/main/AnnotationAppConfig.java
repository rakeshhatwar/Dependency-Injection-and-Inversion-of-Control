package com.wipro.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.wipro.model.Country;
import com.wipro.model.Player;
import com.wipro.model.Student;
import com.wipro.model.Test;

@Configuration
public class AnnotationAppConfig {

	//Student and player details
	
	@Bean(name = "student")
	@Scope("prototype")
	public Student getStudentDetails() {
		return new Student();
	}

	@Bean(name = "test")
	@Scope("prototype")
	public Test getTestDetails() {
		return new Test();
	}
	
	//Player and Country Details
	@Bean(name = "player")
	@Scope("prototype")
	public Player getPlayer() {
		return new Player();
	}
	
	//Player and Country Details
	@Bean(name = "country")
	@Scope("prototype")
	public Country getCountry() {
	return new Country();
	}
}
