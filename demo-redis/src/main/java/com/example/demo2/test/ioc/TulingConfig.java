package com.example.demo2.test.ioc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TulingSelector.class, TulingImportBeanDefinitionRegistrar.class})
public class TulingConfig {
}
