package com.testautomationcoach.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Salary {

    private int amount;

    public Salary() {
        this.amount = 1000;
    }

    public int getAmount() {
        return this.amount;
    }
}
