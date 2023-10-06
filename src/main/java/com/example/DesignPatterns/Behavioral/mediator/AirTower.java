package com.example.DesignPatterns.Behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTower implements Mediator {
    boolean isRoadEmpty = true;
    List<Client> clients;

    public AirTower() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void requestLanding(Client client) throws InterruptedException {
        if (!clients.contains(client)) {
            client.notify("register urself first");
            return;
        }
        if (isRoadEmpty) {
            isRoadEmpty = false;
            notifyOtherClients("road is busy now because " + client.getName() + " is landing ..");
        } else {
            client.notify("road is busy now .. ");
        }
    }

    @Override
    public void notifyEmpty() {
        notifyOtherClients("road is empty now");
        isRoadEmpty = true;
    }


    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void notifyOtherClients(String msg) {
        clients.forEach(client -> client.notify(msg));
    }


}
