package com.cts.springcore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public List<Long> mobileList(){
	    List<Long> mobileList = new ArrayList<>();
	    mobileList.add(99999999l);
	    mobileList.add(88888888l);
	    return mobileList;
	}  
}

