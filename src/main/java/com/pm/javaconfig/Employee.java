package com.pm.javaconfig;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component // Spring IoC Container will create an object of Employee class.
public class Employee {
    private int id;
    private  String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> tasks;

    @Autowired
    private Temp2 temp2;
    @Autowired
    private Temp1 temp1;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", tasks=" + tasks +
                ", temp2=" + temp2 +
                ", temp1=" + temp1 +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method of Employee");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method of Employee");
    }
}
