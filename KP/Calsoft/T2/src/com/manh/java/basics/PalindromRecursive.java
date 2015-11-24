package com.manh.java.basics;

public class PalindromRecursive
{
    public static void main(String[] args)
    {
        String s = "aba";

        if (isPal(s))
        {
            System.out.println("It is paildome");
        }
        else
        {
            System.out.println("Not a paildome");
        }
    }

    public static boolean isPal(String s)
    {
        if (s.length() == 0 | s.length() == 1)
        {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1))
        {
            System.out.println(s.substring(1, s.length() - 1));
            return isPal(s.substring(1, s.length() - 1));
        }
        return false;
    }

}
