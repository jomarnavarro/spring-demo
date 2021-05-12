package com.testautomationcoach.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    @Value("${tv.name:sony}")
    private String name;

    public Television() {
        System.out.println("Inside constructor tv name: " + this.name);
    }

    @PostConstruct
    private void init() {
        System.out.println("Inside init " + this.name);
        System.out.println(this.name + " TV is turned on...");
    }

    public void playMovie() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Playing scene " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @PreDestroy
    public void turnOff() {
        System.out.println("TV is turned off");
    }
}
