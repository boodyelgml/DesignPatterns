package com.example.DesignPatterns.Behavioral.memento;

import java.util.Stack;

public class MementosSaver {
    Stack<Memento> mementos;

    public MementosSaver() {
        this.mementos = new Stack<>();
    }

    public Memento save(Memento state) {
        return this.mementos.push(state);
    }

    public Memento revert() {
        this.mementos.pop();
        return this.mementos.peek();
    }
}
