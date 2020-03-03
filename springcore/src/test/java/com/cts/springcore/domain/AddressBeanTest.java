package com.cts.springcore.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddressBeanTest {
	@Autowired
	AddressBean address;

	@Test
	void testGetHouseNum() {
		System.out.println(address.getHouseNum());
	}
	
	@Test
	void testStreetName() {
		System.out.println(address.getStreet());
	}
	

}
