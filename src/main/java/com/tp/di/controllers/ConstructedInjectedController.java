package com.tp.di.controllers;

import com.tp.di.services.GreetingService;

public class ConstructedInjectedController {
    private final GreetingService greetingService;

    public ConstructedInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
