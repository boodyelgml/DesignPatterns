package com.example.DesignPatterns.Structural.facade;

public class Computer {
    private boolean power;
    private boolean turnOnButton;

    public void turnOn(){
        this.power = true;
        this.turnOnButton = true;
        System.out.println("computer is turned on!");
    }
}
