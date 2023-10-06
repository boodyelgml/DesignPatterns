package com.example.DesignPatterns.Behavioral.template;

public class CounterStrike extends Game {
    @Override
    public void open() {
        System.out.println("open CounterStrike");
    }

    @Override
    public void loadResources() {
        System.out.println("load CounterStrike");
    }

    @Override
    public void startMission() {
        System.out.println("start CounterStrike");
    }
}
