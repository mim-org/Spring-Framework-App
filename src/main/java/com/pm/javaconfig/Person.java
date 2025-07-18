package com.pm.javaconfig;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> tasks;
    private Temp1 temp1;

    public Person(Temp1 temp1) {
        this.temp1 = temp1;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", tasks=" + tasks +
                ", temp1=" + temp1 +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method of Person");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method of Person");
    }
}
