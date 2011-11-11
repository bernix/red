package com.javapatterns.singleton;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class RegSingleton {

    private static Map registry = new HashMap();

    static {
        RegSingleton x = new RegSingleton();
        registry.put(x.getClass().getName(), x);
    }

    protected RegSingleton() {
    }

    public static RegSingleton getInstance(String name) {
        if (name == null) {
            name = "com.javapatterns.singleton.RegSingleton";
        }
        if (registry.get(name) == null) {
            try {
                registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                System.err.println("Error occured.");
            }
        }
        return (RegSingleton) registry.get(name);
    }

    public String about() {
        return "Hello! I am RegSingleton.";
    }
}
