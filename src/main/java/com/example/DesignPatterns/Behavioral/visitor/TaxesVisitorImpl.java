package com.example.DesignPatterns.Behavioral.visitor;

public class TaxesVisitorImpl implements TaxesVisitor {
    @Override
    public void visit(AGM entity) {
        System.out.println("calculating AGM taxes");
    }

    @Override
    public void visit(Tanmeyah entity) {
        System.out.println("calculating Tanmeyah taxes");
    }
}
