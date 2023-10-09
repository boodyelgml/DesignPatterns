package com.example.DesignPatterns.Structural.bridge;

public class Barcelona extends Team{

    public Barcelona(Player player) {
        super(player);
    }

    @Override
    public void startPlaying() {
        System.out.println(player.play() + "Barcelona");
    }
}
