package com.pm.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    //    @Autowired
    private Engine engine;

    @Autowired
    public Car(Engine engine) {
        System.out.println("Inside Car constructor");
        this.engine = engine;
    }

    //    @Autowired
    public void setEngine(Engine engine) {
        System.out.println("Inside setEngine method");
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
