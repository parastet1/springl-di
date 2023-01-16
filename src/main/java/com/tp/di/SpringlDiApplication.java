package com.tp.di;

import com.tp.di.controllers.PropertyInjectedController;
import com.tp.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tp.di.controllers.MyController;

@SpringBootApplication
public class SpringlDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringlDiApplication.class, args); // run method returns a
        // context

        // Now we can ask the context for an instance of my controller
        // by default spring creates spring bean with id name taken from
        // class name, but making the first letter small

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("---- Property ");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---- Setter");
        SetterInjectedController setterInjectedController  = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
    }

}
