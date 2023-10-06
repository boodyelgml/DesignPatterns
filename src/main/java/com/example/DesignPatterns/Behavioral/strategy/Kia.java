package com.example.DesignPatterns.Behavioral.strategy;

public class Kia implements CarType{
    @Override
    public void repair() {
        System.out.println("repairing kia car .. ");
    }
}
