package com.javapatterns.simplefactory;

public class Grape implements Fruit {

    private boolean seedless;

    @Override
    public void grow() {
        log("Grape is growing...");
    }

    @Override
    public void harvest() {
        log("Grape has been harvested.");
    }

    @Override
    public void plant() {
        log("Grape has been planted.");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
