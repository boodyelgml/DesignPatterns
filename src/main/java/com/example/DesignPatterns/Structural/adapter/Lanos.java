package com.example.DesignPatterns.Structural.adapter;

public class Lanos implements OldCar {
    @Override
    public void start() {
        System.out.println("start lanos");
    }

    @Override
    public void stop() {
        System.out.println("stop lanos");

    }
}
