package com.example.DesignPatterns.Behavioral.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Observable {
    List<Observer> observers = new ArrayList<>();
    String state;

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(o -> o.update(state));
    }
}
