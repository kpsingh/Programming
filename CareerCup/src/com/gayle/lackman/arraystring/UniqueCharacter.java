package com.gayle.lackman.arraystring;

/*
 * Class to check if a string has all unique characters. Taking ASCII for time being not Unicode.
 */
public class UniqueCharacter
{
    public static void main(String[] args)
    {
        String s = "Krishna k";

        System.out.println(isUniqueCharacter(s));
    }

    private static boolean isUniqueCharacter(String s)
    {
        if (s.length() > 256)
        {
            return false;
        }

        boolean[] char_Set = new boolean[256];
        for (int i = 0; i < s.length(); i++)
        {
            int val = s.charAt(i);
            if (char_Set[val] == true)
            {
                return false;
            }
            char_Set[val] = true;
        }

        return true;
    }

}
