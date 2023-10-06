package com.example.DesignPatterns.Behavioral.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Engineer {
    private final CarType carType;

    public void repair() {
        carType.repair();
    }

}
