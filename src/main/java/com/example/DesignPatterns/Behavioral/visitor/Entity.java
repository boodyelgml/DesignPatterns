package com.example.DesignPatterns.Behavioral.visitor;

public interface Entity {
    void acceptVisit(TaxesVisitor taxesVisitor);
}
