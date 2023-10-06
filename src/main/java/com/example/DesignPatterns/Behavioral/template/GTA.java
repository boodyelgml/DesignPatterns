package com.example.DesignPatterns.Behavioral.template;

public class GTA extends Game {
    @Override
    public void open() {
        System.out.println("open GTA");
    }

    @Override
    public void loadResources() {
        System.out.println("load GTA");
    }

    @Override
    public void startMission() {
        System.out.println("start GTA");
    }
}
