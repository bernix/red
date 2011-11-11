package com.javapatterns.simplefactory;

public class BadFruitException extends Exception {

    private static final long serialVersionUID = -7570854474147694553L;

    public BadFruitException() {
    }

    public BadFruitException(String message) {
        super(message);
    }

    public BadFruitException(Throwable cause) {
        super(cause);
    }

    public BadFruitException(String message, Throwable cause) {
        super(message, cause);
    }

}
