package com.gayle.lackman.arraystring;

public class RotationalString
{
    public static void main(String[] args)
    {
        String s1 = "ABCD";
        String s2 = "BCDA";

        System.out.println(isRotationnal(s1, s2));

    }

    private static boolean isRotationnal(String s1, String s2)
    {
        if (s1.length() == s2.length() && s1.length() > 0)
        {
            String temp = s1 + s1;

            return temp.contains(s2);

        }
        return false;

    }

}
