package com.example.DesignPatterns.Structural.bridge;

public class Nymar implements Player {
    String name = "nymar";

    @Override
    public void play(Team team) {
        System.out.println(this);
    }

    @Override
    public String playerName() {
        return name;
    }
}
