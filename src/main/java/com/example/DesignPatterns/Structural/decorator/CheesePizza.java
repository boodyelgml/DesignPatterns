package com.example.DesignPatterns.Structural.decorator;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public int price() {
        return decoratedPizza.price() + 10;
    }

    @Override
    public String name() {
        return decoratedPizza.name() + ", Cheese";
    }
}
