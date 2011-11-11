package com.javapatterns.abstractfactory;

public class NorthernVeggie implements Veggie {

    private String name;

    public NorthernVeggie(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
