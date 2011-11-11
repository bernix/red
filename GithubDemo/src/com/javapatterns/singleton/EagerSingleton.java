package com.javapatterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton _INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return _INSTANCE;
    }
}
