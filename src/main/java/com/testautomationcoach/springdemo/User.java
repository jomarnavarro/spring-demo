package com.testautomationcoach.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {


    @Autowired
    private Address address;

    @Autowired
    private Salary salary;

    public void printDetails() {
        System.out.println(
                String.format(
                        "Address: %s\nSalary: %s\n",
                        this.address.getStreet(), this.salary.getAmount())
        );
    }


}
