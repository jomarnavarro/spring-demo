package com.testautomationcoach.springdemo;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDemoApplicationTests {

	/**
	 * To run from the command line and override values, use
	 * <code>mvn clean test -Dvar=value</code>
	 */
	@Autowired
	private User user;

	@Autowired
	private Television tv;

	@Test
	void contextLoads() {
		user.printDetails();
	}

	@Test
	void testTelevision() {
		this.tv.playMovie();
	}

}
