package com.example.DesignPatterns.Behavioral.observer;

import lombok.Setter;

public abstract class Observer {
    @Setter
    public Observable observable;
    void update(String state) {
        System.out.println(state);
    };

    public void hitObservable(String state){
        observable.setState(state);
    }
}
