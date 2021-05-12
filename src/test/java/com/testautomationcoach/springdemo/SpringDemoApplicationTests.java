package com.testautomationcoach.springdemo;

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

	@Value("${MAVEN_HOME}")
	private String mavenHome;

	@Value("${objects.fruits}")
	private List<String> fruits;

	@Test
	void contextLoads() {

		user.printDetails();
		System.out.println(this.mavenHome);
		for (String fruit:
			 fruits) {
			System.out.println(fruit);
		}
	}

}
