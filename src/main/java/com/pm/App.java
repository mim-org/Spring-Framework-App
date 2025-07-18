package com.pm;

import com.pm.annotation.Car;
import com.pm.stereotype.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config3.xml", "config4.xml"});
        // registering shut down hook
        context.registerShutdownHook();

//        Employee e = (Employee) context.getBean("employee");
//        Person p = (Person) context.getBean("person");
//        Temp t1 = (Temp) context.getBean("tref1");
//        Temp t2 = (Temp) context.getBean("tref2");
//        System.out.println(e);
//        System.out.println(p);
//        System.out.println(t1);
//        System.out.println(t2);
          Car car = context.getBean("car",Car.class);
          System.out.println(car);

        Example e1 = (Example) context.getBean("example");
        System.out.println(e1.hashCode());
        Example e2 = (Example) context.getBean("example");
        System.out.println(e2.hashCode());
    }
}
