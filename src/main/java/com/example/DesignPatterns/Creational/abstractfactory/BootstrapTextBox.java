package com.example.DesignPatterns.Creational.abstractfactory;

public class BootstrapTextBox implements TextBox{
    @Override
    public void typeText() {
        System.out.println("type some data inside bootstrap 5 textbox");
    }
}
