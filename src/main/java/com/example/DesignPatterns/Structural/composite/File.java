package com.example.DesignPatterns.Structural.composite;

public class File implements Component {
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "file";
    }
}
