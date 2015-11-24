package com.mmty;

public class RegexTest
{

    public static void main(String[] args)
    {
        String s = "aaa";
        System.out.println(isAlphaNumeric(s));
    }

    public static boolean isAlphaNumeric(String s)
    {
        boolean flag = true;

        String pattern = "^[a-zA-Z0-9]*$";
        String pattern2 = "^[0-9]*$";

        if (s.matches(pattern2))
        {
            flag = false;
            return flag;
        }
        return flag;
    }

}
