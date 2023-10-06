package com.example.DesignPatterns.Behavioral.template;

public abstract class Game {

    public void load() {
        open();
        loadResources();
        startMission();
    }

    abstract void open();
    abstract void loadResources();
    abstract void startMission();
}
