package com.example.demo2.test.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class TulingConfigration {
    @Bean
    public TulingAspect tulingAspect() {
        System.out.println("TulingAspect组件自动装配到容器中");
        return new TulingAspect();
    }
    @Bean
    @Conditional(value = TulingConditional.class)
    public TulingLog tulingLog() {
        System.out.println("TulingLog组件自动装配到容器中");
        return new TulingLog();
    }
}
