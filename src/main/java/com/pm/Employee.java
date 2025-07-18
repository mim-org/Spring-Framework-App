package com.pm;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id;
    private  String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> tasks;
    private Temp temp;


//    public Employee() {
//    }
//
//    public Employee(int id, String name, List<String> phones, Set<String> addresses, Map<String, String> tasks) {
//        this.id = id;
//        this.name = name;
//        this.phones = phones;
//        this.addresses = addresses;
//        this.tasks = tasks;
//    }

//    public int getId() {
//        return id;
//    }

    public void setId(int id) {
        this.id = id;
    }
//
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<String> getPhones() {
//        return phones;
//    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

//    public Set<String> getAddresses() {
//        return addresses;
//    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

//    public Map<String, String> getTasks() {
//        return tasks;
//    }

    public void setTasks(Map<String, String> tasks) {
        this.tasks = tasks;
    }

//    public Temp getTemp() {
//        return temp;
//    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", tasks=" + tasks +
                ", temp=" + temp +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method of Employee");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method  of Employee");
    }
}
