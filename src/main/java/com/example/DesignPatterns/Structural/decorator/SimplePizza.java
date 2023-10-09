package com.example.DesignPatterns.Structural.decorator;

public class SimplePizza implements Pizza {
    @Override
    public int price() {
        return 20;
    }

    @Override
    public String name() {
        return "Pizza with ";
    }
}
