package com.example.DesignPatterns.Behavioral.interpreter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AndExecution implements Execution {
    private final Execution execution1;
    private final Execution execution2;

    @Override
    public boolean interpret(String context) {
        return execution1.interpret(context) && execution2.interpret(context);
    }
}
