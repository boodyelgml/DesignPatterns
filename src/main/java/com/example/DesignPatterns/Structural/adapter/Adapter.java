package com.example.DesignPatterns.Structural.adapter;
/*
    Adapter consist of 3 parts
    oldInterface --> adaptee "GazCar"
    NewInterface --> Target "ElectricCar"
    Adapter class which implements NewInterface
 */

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class Adapter implements GazCar {

    @Autowired
    private final ElectricCar electricCar;

    @Override
    public void start() {
        electricCar.on();
    }

    @Override
    public void stop() {
        electricCar.off();
    }
}


