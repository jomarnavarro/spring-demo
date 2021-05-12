package com.testautomationcoach.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${address.default:123 main street}")
    public String street;

    public String getStreet() {
        return this.street;
    }


}
