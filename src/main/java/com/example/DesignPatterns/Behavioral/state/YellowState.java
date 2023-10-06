package com.example.DesignPatterns.Behavioral.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class YellowState implements State {

    private Lamp lamp;

    @Override
    public void getColor() {
        System.out.println("Lamp is now yellow.");
    }
}
