package com.saravanan.didemo.service;

public class GreetingServiceImpl implements GreetingService {

    public final static String HELLO_WELCOME_MSG="Hello Welcome to DI";
    @Override
    public String sayGreeting() {
        return HELLO_WELCOME_MSG;
    }
}
