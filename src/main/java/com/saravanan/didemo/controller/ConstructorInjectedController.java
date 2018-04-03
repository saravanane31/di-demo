package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayWelcome(){
        return greetingService.sayGreeting();
    }
}
