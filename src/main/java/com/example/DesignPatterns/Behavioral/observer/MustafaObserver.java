package com.example.DesignPatterns.Behavioral.observer;

public class MustafaObserver extends Observer {
    @Override
    void update(String state) {
        super.update(state + " from mustafa");
    }
}
