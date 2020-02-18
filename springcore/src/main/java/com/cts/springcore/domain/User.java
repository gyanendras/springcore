package com.cts.springcore.domain;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * User class represents a registered user.
 */
@Component
@Qualifier("registereduser")
@Scope(value =  ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	
	private AddressBean address;
	
	@Resource(name="mobileList")
	private List<Long> mobileNum;

   @Autowired 
    private Preferences prefs;
	

	/*
	 * Initializes user with mandatory fields
	 * firstName, lastName and email are constructor injected
	 */
	@Autowired
	public User(@Value("DefaultFname") String firstName, @Value("DefaultLname") String lastName,
			@Value("default@default.com") String email) {
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


	public AddressBean getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(AddressBean address) {
		this.address = address;
	}

	public List<Long> getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(List<Long> mobileNum) {
		this.mobileNum = mobileNum;
	}


	
	@Component
	public static class Preferences{
		private String language;
        private	String mealType;
		private String shirtSize;
		
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getMealType() {
			return mealType;
		}
		public void setMealType(String mealType) {
			this.mealType = mealType;
		}
		public String getShirtSize() {
			return shirtSize;
		}
		public void setShirtSize(String shirtSize) {
			this.shirtSize = shirtSize;
		}
		
		
		
	}

	public Preferences getPrefs() {
		return prefs;
	}

	public void setPrefs(Preferences prefs) {
		this.prefs = prefs;
	}

}
