package com.example.DesignPatterns.Structural.adapter;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class OldCarAdapter implements NewCar {

    @Autowired
    private final OldCar oldCar;


    @Override
    public void on() {
        oldCar.start();
    }

    @Override
    public void off() {
        oldCar.stop();
    }
}


