package com.testautomationcoach.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Value("${salary.amount:500}")
    private int amount;

    public int getAmount() {
        return this.amount;
    }
}
