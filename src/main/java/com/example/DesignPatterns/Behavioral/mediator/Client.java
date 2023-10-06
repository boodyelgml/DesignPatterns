package com.example.DesignPatterns.Behavioral.mediator;

import lombok.Getter;

public abstract class Client {

    @Getter
    String name;

    abstract void requestLanding(Mediator mediator) throws InterruptedException;

    abstract void notify(String msg);
}
