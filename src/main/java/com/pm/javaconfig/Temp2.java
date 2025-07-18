package com.pm.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Temp2 {
    private int id = 1;

    public Temp2() {
    }

    public Temp2(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Temp2{" +
                "id=" + id +
                '}';
    }
}
