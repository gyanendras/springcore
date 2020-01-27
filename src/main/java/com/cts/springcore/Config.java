package com.cts.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cts.springcore.domain.User;

@Configuration
@ComponentScan("com.cts.springcore")
public class Config {
	
	@Bean
	public User user(){
		return new User("DefaultFname","DefaultLname","default@default.com");
	}

}
