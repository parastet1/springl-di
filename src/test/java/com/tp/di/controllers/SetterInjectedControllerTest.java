package com.tp.di.controllers;

import com.tp.di.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
        // setter injection is fine
        // but the most preferred way is to use constructor
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}