package com.example.DesignPatterns.Structural.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProxyImage implements Image{
    private Image realImage;
    private final String filename;


    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
