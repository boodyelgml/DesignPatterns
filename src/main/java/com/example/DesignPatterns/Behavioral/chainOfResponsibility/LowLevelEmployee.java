package com.example.DesignPatterns.Behavioral.chainOfResponsibility;

public class LowLevelEmployee implements Handler {

    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.type.startsWith("low")) {
            System.out.println("success from low");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
