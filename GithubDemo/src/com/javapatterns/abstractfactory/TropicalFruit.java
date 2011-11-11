package com.javapatterns.abstractfactory;

public class TropicalFruit implements Fruit {

    private String name;

    public TropicalFruit(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
