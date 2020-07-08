package com.designpatterns.Decorator.Solution;


public class BorderStyleDecorator extends ShapeDecorator {

    protected  LineStyle lineStyle;

    public BorderStyleDecorator(Shape newShape, LineStyle lineStyle) {
        super(newShape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        System.out.println("Drawing with border style "+ lineStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " with line style "+ lineStyle+ ";";
    }
}
