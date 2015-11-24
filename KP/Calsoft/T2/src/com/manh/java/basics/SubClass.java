package com.manh.java.basics;

public class SubClass extends SuperClass
{
    public static int multiply(int a, int b)
    {
        int c = SuperClass.multiply(2,3);
        return c;
        
    }
    
}

class SuperClass
{
    protected static int multiply(int a, int b)
    {
        return a*b;
    }
}