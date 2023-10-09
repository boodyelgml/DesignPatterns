package com.example.DesignPatterns.Structural.bridge;

public abstract class Team {
    Player player;

    public Team(Player player) {
        this.player = player;
    }

    abstract public void startPlaying();
}
