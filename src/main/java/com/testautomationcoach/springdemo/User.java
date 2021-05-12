package com.testautomationcoach.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {



    private Address address;

    private Salary salary;

@   Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(
                String.format(
                        "Address: %s\nSalary: %s\n",
                        this.address.getStreet(), this.salary.getAmount())
        );
    }


}
