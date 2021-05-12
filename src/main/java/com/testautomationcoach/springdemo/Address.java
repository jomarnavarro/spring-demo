package com.testautomationcoach.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Address {

    public String street;

    public Address() {
        this.street = "101 non main street";
    }

    public String getStreet() {
        return this.street;
    }


}
