package com.tp.di.controllers;

import com.tp.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
        // setting up the test condition
        // runs before each test is run
    void setUp() {
        // mimicing the spring framework
        // object creation and dependency setting up
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
        // this is one way of dependency injection but we are not going to do that
        // property injection is not a good idea
        // least preferred way
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}