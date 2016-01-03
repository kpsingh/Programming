package com.manh.test.dp.factorypattern;

public class AreaFactoryDemo
{
    public static void main(String[] args)
    {
        AreaFactory areafFactory = new AreaFactory();
        Area circle = areafFactory.getArea("Circle");
        Area square = areafFactory.getArea("Square");
        Area rectangel = areafFactory.getArea("Rectable");
        
        System.out.println("Area of Circle : " + circle.calculateArea(5));
        System.out.println("Area of Square : " + square.calculateArea(5));
        System.out.println("Area of Rectangle : " + rectangel.calculateArea(5));

    }

}
