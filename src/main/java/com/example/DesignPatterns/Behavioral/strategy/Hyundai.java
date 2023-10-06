package com.example.DesignPatterns.Behavioral.strategy;

public class Hyundai implements CarType {
    @Override
    public void repair() {
        System.out.println("repairing Hyundai car .. ");
    }
}