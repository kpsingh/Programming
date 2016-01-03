package com.manh.java.basics;

public class PalindromOne
{
    public static void main(String[] args)
    {
        String s = "kamalcamak";
        char[] arr = s.toCharArray();
        boolean palindrom = isPalindome(arr);
        System.out.println(palindrom);
    }

    public static boolean isPalindome(char[] s)
    {
        System.out.println(s.length);
        for (int i = 0, j = (s.length - 1); i < j; i++, j--)
        {
            if (s[i] != s[j])
            {
                return false;
            }
        }
        return true;

    }
}
