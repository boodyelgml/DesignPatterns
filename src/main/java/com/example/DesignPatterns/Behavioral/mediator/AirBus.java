package com.example.DesignPatterns.Behavioral.mediator;

import lombok.Getter;

public class AirBus extends Client {

    @Getter
    String name = "AirBus";

    private final Mediator mediator;

    public AirBus(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void requestLanding(Mediator mediator) throws InterruptedException {
        mediator.requestLanding(this);
    }

    @Override
    public void notify(String msg) {
        System.out.println("AirBus Radio : " + msg);
    }
}
