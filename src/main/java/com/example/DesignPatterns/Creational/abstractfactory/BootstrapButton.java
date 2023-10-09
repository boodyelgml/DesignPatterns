package com.example.DesignPatterns.Creational.abstractfactory;

public class BootstrapButton implements Button{

    @Override
    public void click() {
        System.out.println("click on bootstrap 5 button");
    }
}
