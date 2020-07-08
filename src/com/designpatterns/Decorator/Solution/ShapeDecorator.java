package com.designpatterns.Decorator.Solution;

public abstract class ShapeDecorator implements Shape{
    protected  Shape decoratedShape;

    public ShapeDecorator(Shape newShape){
        super();
        this.decoratedShape = newShape;
    }
}
