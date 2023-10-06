package com.example.DesignPatterns.Behavioral.visitor;

public class AGM implements Entity {
    @Override
    public void acceptVisit(TaxesVisitor taxesVisitor) {
        taxesVisitor.visit(this);
    }
}
