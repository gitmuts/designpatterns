package com.designpatterns.Decorator.Solution;

public class Main {
    public static void main(String [] args){

        Shape circle = new Circle();

        Shape rectangle = new Rectangle();

       Shape circleBlackBorder = new BorderColorDecorator(new Circle(), Color.BLACK);


        Shape rectangleRedBorderDotted = new BorderColorDecorator(new BorderStyleDecorator(new Rectangle(), LineStyle.DOT),Color.BLACK);

        System.out.println(circleBlackBorder.description());

        System.out.println(rectangleRedBorderDotted.description());


        // What will we do when we want to add new features?
    }
}
