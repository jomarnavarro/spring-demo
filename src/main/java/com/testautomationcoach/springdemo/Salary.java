package com.testautomationcoach.springdemo;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Autowired
    private Faker faker;

    public int getAmount() {
        return this.faker.number().numberBetween(500, 5000);
    }
}
