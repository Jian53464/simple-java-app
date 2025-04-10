package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I cooked by Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("I am cooked!");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
