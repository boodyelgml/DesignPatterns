package com.example.DesignPatterns.Behavioral.memento;


public class Game {

    private final MementosSaver mementosSaver;

    public Game() {
        this.mementosSaver = new MementosSaver();
    }

    public void save(Memento state) {
        System.out.println(mementosSaver.save(state).getName() + " saved!");
    }

    public void revert() {
        System.out.println("reverted to : " + mementosSaver.revert().getName());
    }
}
