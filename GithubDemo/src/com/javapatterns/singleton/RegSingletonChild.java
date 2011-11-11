package com.javapatterns.singleton;

public class RegSingletonChild extends RegSingleton {

    protected RegSingletonChild() {
    }

    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton
                .getInstance("com.javapatterns.singleton.RegSingletonChild");
    }

    public String about() {
        return "Hello! I am RegSingletonChild.";
    }
}
