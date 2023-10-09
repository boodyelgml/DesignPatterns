package com.example.DesignPatterns.Creational.singelton;

public class Singelton {
    private static Singelton instance;

    public Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}
