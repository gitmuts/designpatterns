package com.designpatterns.Decorator.Solution;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing ");
    }

    @Override
    public String description() {
        return "Rectangle ";
    }
}
