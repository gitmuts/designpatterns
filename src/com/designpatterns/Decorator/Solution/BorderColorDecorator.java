package com.designpatterns.Decorator.Solution;

import java.util.zip.CheckedOutputStream;

public class BorderColorDecorator extends ShapeDecorator{

    protected Color color;

    public BorderColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Drawing with Border color "+ color+ ";");
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " with color "+ color + ";";
    }
}
