package com.example.DesignPatterns.Creational.factory;

import java.util.Objects;

public class ShapeFactory {
    public static Shape createShape(String shape) {
        if (Objects.equals(shape, "Circle")) {
            return new Circle();
        } else if (Objects.equals(shape, "Rectangle")) {
            return new Rectangle();
        } else {
            return new Shape() {
                @Override
                public void draw() {
                    System.out.println("undefined shape");
                }
            };
        }
    }
}
