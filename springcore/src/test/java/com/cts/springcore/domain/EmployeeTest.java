package com.cts.springcore.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTest {
	@Autowired
	Employee emp;
	
	@Test
	void testEmployee() {
		assertEquals("EmpFname", emp.getFirstName());
	}

	@Test
	void testCalcualateSalary() {
		assertEquals(10000.00, emp.calcualateSalary());
	}

}
