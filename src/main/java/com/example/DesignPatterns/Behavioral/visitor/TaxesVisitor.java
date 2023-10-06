package com.example.DesignPatterns.Behavioral.visitor;

public interface TaxesVisitor {
    void visit(AGM entity);
    void visit(Tanmeyah entity);
}
