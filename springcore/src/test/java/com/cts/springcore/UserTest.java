package com.cts.springcore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.springcore.domain.AddressBean;
import com.cts.springcore.domain.User;

@SpringBootTest
public class UserTest {

	@Autowired
	@Qualifier("registereduser2")
	User usr;
		
	@Autowired
	String xmlStringBean1; 

	// test Constructor injection has initialized properties properly
	@Test
	public void testPrintUser() {
		assertEquals("fn", usr.getFirstName());
		assertEquals("ln", usr.getLastName());
		assertEquals("default@default.com", usr.getEmail());
	}

	// test setter injection has injected an AddressBean.
	@Test
	public void testAddressIsNotNull() {
		assertNotNull(usr.getAddress());

	}

	// test that list of mobile numbers is injected in the bean.
	@Test
	public void testMobileNumbers() {
		assertEquals(2, usr.getMobileNum().size());

	}

	@Test
	public void testPreferences() {
		usr.getPrefs().setLanguage("French");
		assertEquals("French", usr.getPrefs().getLanguage());

	}
	
	@Test
	public void testXmlCOnfig() {
		System.out.println(xmlStringBean1);
	}

}
