package com.designpatterns.Decorator.Problem;

public class Main {

    public static void main(String args[]){

        Shape circle = new Circle();

        Shape Rectangle = new Rectangle();

        // what if we need new features, say when drawing rectangle have a red color, blue color for
        // different instances

        // if we are following inheritance model, we would have RectangleBlueBorder, RectangleRedBorder

    }
}
