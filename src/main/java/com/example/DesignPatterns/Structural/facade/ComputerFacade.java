package com.example.DesignPatterns.Structural.facade;

 import org.springframework.beans.factory.annotation.Autowired;


public class ComputerFacade {
    @Autowired
    private final Computer computer = new Computer();
    private final Monitor monitor = new Monitor();
    private final Mouse mouse = new Mouse();
    private final Keyboard keyboard = new Keyboard();


    public void turnOn() {
        new Computer().turnOn();
        this.keyboard.turnOn();
        this.monitor.turnOn();
        this.computer.turnOn();
    }
}
