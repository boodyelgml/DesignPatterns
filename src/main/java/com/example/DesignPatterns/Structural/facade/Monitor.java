package com.example.DesignPatterns.Structural.facade;

public class Monitor {
    private boolean connectToComputer;
    private boolean turnOnButton;

    public void turnOn(){
        this.connectToComputer = true;
        this.turnOnButton = true;
        System.out.println("monitor is turned on!");
    }

    public void turnOff(){
        this.connectToComputer = true;
        this.turnOnButton = true;
        System.out.println("monitor is turned off!");
    }
}
