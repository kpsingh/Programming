package com.manh.test.dp.factorypattern;

public class ShapeFactoryDemo
{
    public static void main(String[] args)
    {
        ShapeFactoty sp = new ShapeFactoty();

        Shape circle = sp.getShape("Circle");
        Shape rectable = sp.getShape("Rectangle");
        Shape square = sp.getShape("Square");
        circle.draw();
        rectable.draw();
        square.draw();

    }
}
