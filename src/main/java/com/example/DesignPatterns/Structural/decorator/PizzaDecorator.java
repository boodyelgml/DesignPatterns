package com.example.DesignPatterns.Structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PizzaDecorator implements Pizza {
    protected final Pizza decoratedPizza;

    @Override
    public int price() {
        return decoratedPizza.price();
    }

    @Override
    public String name() {
        return decoratedPizza.name();
    }
}
