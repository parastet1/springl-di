package com.tp.di.controllers;

import org.springframework.stereotype.Controller;

@Controller // annotation tells that it is a spring managed component
// @Controller is one of stereotype annotations
public class MyController {
    public String sayHello() {
	System.out.println("Hello World!");
	return "Hello Spring";
    }
}
