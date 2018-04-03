package com.saravanan.didemo;

import com.saravanan.didemo.controller.ConstructorInjectedController;
import com.saravanan.didemo.controller.MyController;
import com.saravanan.didemo.controller.PropertyInjectedController;
import com.saravanan.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
        MyController controller =(MyController) ctx.getBean("myController");
        controller.sayHello();


        System.out.println(ctx.getBean(PropertyInjectedController.class).sayWelcome());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayWelcome());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayWelcome());
    }
}
