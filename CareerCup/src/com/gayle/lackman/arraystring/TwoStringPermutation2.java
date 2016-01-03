package com.gayle.lackman.arraystring;

/*
 * This class to check if two strings are permutation of each other or not.
 */
public class TwoStringPermutation2
{
    public static void main(String[] args)
    {
        String s = "gode";
        String t = "adog";

        System.out.println(isPermutation(s, t));
    }

    private static boolean isPermutation(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        char[] temp = s.toCharArray();

        int char_count[] = new int[256];

        for (char c : temp)
        {
            char_count[c]++;
        }

        for (int i = 0; i < t.length(); i++)
        {
            if (--char_count[t.charAt(i)] < 0)
            {
                return false;
            }
        }

        return true;
    }

}
