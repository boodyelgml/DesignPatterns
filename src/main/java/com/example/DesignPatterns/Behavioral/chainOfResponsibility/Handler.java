package com.example.DesignPatterns.Behavioral.chainOfResponsibility;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler handler);
}
