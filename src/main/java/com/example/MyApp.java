package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        MessageService messageService = applicationContext.getBean("messageServiceOne", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("messageServiceTwo", MessageService.class);
        System.out.println(messageService.hashCode());
        System.out.println(messageService1.getMessage());

    }
}
