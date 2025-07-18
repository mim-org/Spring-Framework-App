package com.pm;

public class Temp {
    private int id;

    public Temp() {
    }

    public Temp(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "id=" + id +
                '}';
    }
}
