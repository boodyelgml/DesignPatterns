package com.example.DesignPatterns.Behavioral.mediator;

public interface Mediator {
    void requestLanding(Client client) throws InterruptedException;

    void notifyEmpty();

    void registerClient(Client client);

    void notifyOtherClients(String msg);
}
