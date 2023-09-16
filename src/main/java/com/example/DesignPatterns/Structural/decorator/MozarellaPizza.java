package com.example.DesignPatterns.Structural.decorator;

import java.math.BigDecimal;

public class MozarellaPizza implements Pizza {
    private Pizza pizza;

    public MozarellaPizza() {
    }

    public MozarellaPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getName() {
        return "Mozarella Pizza " + "with adds of ( " + pizza.getName() + " ) ";
    }
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(50).add(pizza.getPrice());
    }
}
