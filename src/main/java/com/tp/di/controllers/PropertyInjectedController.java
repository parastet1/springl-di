package com.tp.di.controllers;

import com.tp.di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
