package com.javapatterns.factorymethod;

public class ConcreteCreator1 implements Creator {

    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }

}
