package com.manh.java.basics;

public class YLikes
{

    public static void go(Long l)
    {
        System.out.println("Long");
    }

    public static void go(short l)
    {
        System.out.println("short");

    }

    public static void go(Short l)
    {
        System.out.println("Short");
    }

    public static void main(String[] args)
    {
        Short y = 6;
        long z = 7;

        go(y);
        go(z);
    }

}
