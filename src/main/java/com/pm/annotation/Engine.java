package com.pm.annotation;

public class Engine {
    private int price;

    public Engine(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "price=" + price +
                '}';
    }
}
