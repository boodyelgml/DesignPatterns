package com.example.DesignPatterns.Behavioral.chainOfResponsibility;

public class HighLevelEmployee implements Handler {

    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.type.startsWith("high")) {
            System.out.println("success from high");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }
}
