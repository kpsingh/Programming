package com.manh.test.dp.factorypattern;

public class ShapeFactoty
{
    public Shape getShape(String s)
    {
        if (s == null)
            return null;
        if(s.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        if(s.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        if(s.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        return null;
    }

}
