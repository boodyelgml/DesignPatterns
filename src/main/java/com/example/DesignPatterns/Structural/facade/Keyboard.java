package com.example.DesignPatterns.Structural.facade;

public class Keyboard {
    private boolean connectedToComputer;

    public void turnOn(){
        this.connectedToComputer = true;
        System.out.println("keyboard is connected to computer!");
    }
}
