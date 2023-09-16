package com.example.DesignPatterns.Structural.decorator;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {
    public BasicPizza() {
    }
    @Override
    public String getName() {
        return "Basic Pizza ";
    }
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(100);
    }
}
