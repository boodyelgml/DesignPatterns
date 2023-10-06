package com.example.DesignPatterns.Behavioral.chainOfResponsibility;

public class MidLevelEmployee implements Handler {

    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.type.startsWith("mid")) {
            System.out.println("success from mid");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }
}
