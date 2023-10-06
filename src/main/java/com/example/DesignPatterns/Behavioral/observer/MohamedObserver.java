package com.example.DesignPatterns.Behavioral.observer;

public class MohamedObserver extends Observer {
    @Override
    void update(String state) {
        super.update(state + " from mohamed");
    }
}
