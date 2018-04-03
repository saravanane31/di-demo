package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WELCOME_MSG,propertyInjectedController.sayWelcome());
    }
}