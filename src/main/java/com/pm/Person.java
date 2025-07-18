package com.pm;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private int id;
    private  String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> tasks;
    private Temp temp;

    public Person(int id, String name, List<String> phones, Set<String> addresses, Map<String, String> tasks, Temp temp) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.tasks = tasks;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", tasks=" + tasks +
                ", temp=" + temp +
                '}';
    }

    public void init(){
        System.out.println("Init method of Person");
    }

    public void destroy(){
        System.out.println("Destroy method of Person");
    }
}
