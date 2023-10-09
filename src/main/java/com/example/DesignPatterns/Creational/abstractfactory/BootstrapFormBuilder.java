package com.example.DesignPatterns.Creational.abstractfactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BootstrapFormBuilder implements FormBuilder {


    @Override
    public Button createButton() {
        return new BootstrapButton();
    }

    @Override
    public TextBox createTextBox() {
        return new BootstrapTextBox();
    }
}
