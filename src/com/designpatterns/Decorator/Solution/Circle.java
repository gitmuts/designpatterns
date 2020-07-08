package com.designpatterns.Decorator.Solution;


public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing ");
    }

    @Override
    public String description() {
        return "Circle ";
    }
}
