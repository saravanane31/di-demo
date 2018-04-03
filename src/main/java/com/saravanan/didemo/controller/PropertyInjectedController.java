package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayWelcome(){
        return greetingService.sayGreeting();
    }
}
