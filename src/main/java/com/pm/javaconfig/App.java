package com.pm.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee e = context.getBean("employee", Employee.class);
        System.out.println(e);

        Person p = context.getBean("getPerson", Person.class);
        System.out.println(p);


    }
}
