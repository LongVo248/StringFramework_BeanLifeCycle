package com.example.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld objA= (HelloWorld) context.getBean("helloWorld");
        objA.getMessage();
        context.registerShutdownHook();
    }
}
