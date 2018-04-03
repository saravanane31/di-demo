package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayWelcome(){
        return greetingService.sayGreeting();
    }
}
