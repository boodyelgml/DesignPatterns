package com.example.DesignPatterns.Creational.builder;

public class StudentBuilder {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
