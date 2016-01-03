package com.gayle.lackman.arraystring;

import java.util.Arrays;

public class TwoStringPermutation
{
    public static void main(String[] args)
    {
        String s = "god";
        String t = "doc";

        System.out.println(isPermutation(s, t));
        
        
    }

    private static boolean isPermutation(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        s = sort(s);
        t = sort(t);

        return s.equals(t);
    }

    private static String sort(String s)
    {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

}
