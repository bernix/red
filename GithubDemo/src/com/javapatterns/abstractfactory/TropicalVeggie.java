package com.javapatterns.abstractfactory;

public class TropicalVeggie implements Veggie {

    private String name;

    public TropicalVeggie(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
