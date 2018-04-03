package com.saravanan.didemo.controller;

import com.saravanan.didemo.service.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WELCOME_MSG,setterInjectedController.sayWelcome());
    }
}