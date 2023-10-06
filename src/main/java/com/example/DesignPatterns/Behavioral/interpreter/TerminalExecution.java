package com.example.DesignPatterns.Behavioral.interpreter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TerminalExecution implements Execution {
    private final String data;

    @Override
    public boolean interpret(String context) {
        return data.contains(context);
    }
}
