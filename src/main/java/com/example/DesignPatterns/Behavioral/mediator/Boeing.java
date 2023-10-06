package com.example.DesignPatterns.Behavioral.mediator;

import lombok.Getter;

public class Boeing extends Client {

    @Getter
    String name = "Boeing";
    private final Mediator mediator;

    public Boeing(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void requestLanding(Mediator mediator) throws InterruptedException {
        mediator.requestLanding(this);
    }

    @Override
    public void notify(String msg) {
        System.out.println("Boeing Radio : " + msg);
    }
}
