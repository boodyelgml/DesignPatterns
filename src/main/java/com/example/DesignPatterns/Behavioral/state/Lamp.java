package com.example.DesignPatterns.Behavioral.state;

public class Lamp implements State {
    State state;

    public Lamp() {
        this.state = new GreenState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void getColor() {
        state.getColor();
    }
}
