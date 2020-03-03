package com.cts.springcore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.springcore.domain.User;

@Configuration
public class Config {

	@Bean
	public List<Long> mobileList(){
	    List<Long> mobileList = new ArrayList<>();
	    mobileList.add(99999999l);
	    mobileList.add(88888888l);
	    return mobileList;
	} 
	
	@Bean
	@Qualifier("registereduser2")
	public User getUser() {
		return new User("fn","ln","d@d.com");
	}
}

