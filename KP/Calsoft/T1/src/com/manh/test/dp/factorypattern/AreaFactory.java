package com.manh.test.dp.factorypattern;

public class AreaFactory
{
    public Area getArea(String areaType)
    {
        if (areaType == null)
            return null;
        if(areaType.equalsIgnoreCase("Circle"))
        {
            return new CircleArea();
        }
        if(areaType.equalsIgnoreCase("Rectable"))
        {
            return new RectangelArea();
        }
        if(areaType.equalsIgnoreCase("Square"))
        {
            return new SquareArea();
        }
        return null;
    }

}
