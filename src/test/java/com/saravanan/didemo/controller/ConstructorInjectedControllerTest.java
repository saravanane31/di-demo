package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WELCOME_MSG,constructorInjectedController.sayWelcome());
    }
}