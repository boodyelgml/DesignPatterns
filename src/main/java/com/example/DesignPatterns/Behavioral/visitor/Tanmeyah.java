package com.example.DesignPatterns.Behavioral.visitor;

public class Tanmeyah implements Entity{
    @Override
    public void acceptVisit(TaxesVisitor taxesVisitor) {
        taxesVisitor.visit(this);
    }
}
