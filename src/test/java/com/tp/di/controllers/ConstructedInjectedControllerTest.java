package com.tp.di.controllers;

import com.tp.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructedInjectedControllerTest {
    ConstructedInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructedInjectedController(new GreetingServiceImpl());
        // constructor dependency injection is most preferred way to inject dependency
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}