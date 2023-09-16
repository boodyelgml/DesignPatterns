package com.example.DesignPatterns.Structural.bridge;

import java.util.List;

public class PSG implements Team {

    @Override
    public void playMembers(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.playerName());
        }
    }
}
