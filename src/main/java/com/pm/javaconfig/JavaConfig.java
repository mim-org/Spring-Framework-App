package com.pm.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring IoC container understands that this class is handling configurations. // xml file
@ComponentScan(basePackages = "com.pm.javaconfig")
public class JavaConfig {

    @Bean
    public Temp1 getTemp1() {
        Temp1 temp1 = new Temp1(10);
        return temp1;
    }

    @Bean // Spring IoC container understands that the returned object will be stored in Spring IoC container
    public Person getPerson() {
        Person person = new Person(getTemp1());
        return person;
    }
}
