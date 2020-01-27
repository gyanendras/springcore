package com.cts.springcore;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.springcore.domain.User;

@RunWith(SpringRunner.class)
public class UserTest {
	@Autowired
	User usr;

	@Test
	public void testPrintEmployee() {
			assertEquals("DefaultFname", usr.getFirstName() );
	}

}
