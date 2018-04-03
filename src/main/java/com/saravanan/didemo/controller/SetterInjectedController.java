package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayWelcome(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
