package com.example.DesignPatterns.Behavioral.memento;

public class Memento {
    private final String name;

    public Memento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
