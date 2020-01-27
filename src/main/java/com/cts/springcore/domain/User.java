package com.cts.springcore.domain;

import org.springframework.stereotype.Component;

/*
 * User class represents a registered user.
 */
@Component
public class User {
	String firstName;
	String lastName;
	String email;
	Double salary;
	AddressBean address;

	/*
	 * Initializes user with mandatory fields
	 */
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public AddressBean getAddress() {
		return address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

	void printEmployee() {
		System.out.println("FirstName:" + firstName + "\n" +
								"LastName:" + lastName);
	}

}
