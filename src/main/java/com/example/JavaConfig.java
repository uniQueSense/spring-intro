package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class JavaConfig {

    @Bean
    @Scope("prototype")
    public MessageService messageServiceOne() {
        return new RandomTextMessageService();
    }

    @Bean
    @Scope("prototype")
    public MessageService messageServiceTwo() {
        return new MyNameMessageService();
    }
}
