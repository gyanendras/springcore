package com.cts.springcore.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cts.springcore.Remunerable;

@Component
@Qualifier("emp")
public class Employee extends User implements Remunerable {
	
	private Long empId;
	private String empType;
	private double salary;
	private String orgName;

	@Autowired
	public Employee(@Value("EmpFname") String firstName, @Value("EmpLname") String lastName,
			@Value("emp@default.com") String email) {
		super(firstName, lastName, email);
		
	}

	@Override
	public double calcualateSalary() {
		return 10000.00;
	}
	
	

}
