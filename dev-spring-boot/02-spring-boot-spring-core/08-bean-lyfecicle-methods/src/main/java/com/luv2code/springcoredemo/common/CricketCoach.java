package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.stereotype.Component;



@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor=" + getClass().getSimpleName());
    }

    //define out init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff == " + getClass().getSimpleName());

    }

    //define out destroy method
    @PreDestroy
    public void doCleanupup() {
        System.out.println("In doCleanupup == " + getClass().getSimpleName());

    }
    @Override
public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!! \n Good job, mate";
    }
}
