package com.example.DesignPatterns.Structural.decorator;

public class ChickenPizza extends PizzaDecorator {
    public ChickenPizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public int price() {
        return decoratedPizza.price() + 8;
    }

    @Override
    public String name() {
        return decoratedPizza.name() + ", Chicken";
    }
}
