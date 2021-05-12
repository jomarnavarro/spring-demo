package com.testautomationcoach.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDemoApplicationTests {

	@Autowired
	private User user;

	@Test
	void contextLoads() {

		user.printDetails();
	}

}
