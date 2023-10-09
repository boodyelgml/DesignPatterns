package com.example.DesignPatterns.Creational.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {

    public Student(StudentBuilder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
