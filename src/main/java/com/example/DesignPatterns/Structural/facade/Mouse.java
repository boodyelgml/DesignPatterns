package com.example.DesignPatterns.Structural.facade;

public class Mouse {
    private boolean connectedToComputer;

    public void turnOn(){
        this.connectedToComputer = true;
        System.out.println("mouse is connected to computer!");
    }
}
