package com.manh.java.basics;

import java.util.Set;
import java.util.LinkedHashSet;

public class PalindromThree
{
    public static Set<String> set = new LinkedHashSet<String>();

    public static void main(String[] args)
    {
        String s = "abc";
        char[] arr = s.toCharArray();
        permute(s, "");

        System.out.println(set);
        System.out.println(isPalindrom(arr));
        System.out.println(set.size());

    }

    /*
     * Method to check of string is palindome or not.
     */
    public static boolean isPalindrom(char[] arr)
    {
        int N = arr.length;

        for (int i = 0, j = N - 1; i < j; i++, j--)
        {
            if (arr[i] != arr[j])
            {
                return false;
            }

        }
        return true;

    }
    /*
     * Method to calculate permutations of a given string and store into a set.
     */
    public static void permute(String s, String prefix)
    {
        int N = s.length();

        if (N == 0)
        {
            set.add(prefix);
        }
        for (int i = 0; i < N; i++)
        {
            permute(s.substring(0, i) + s.substring(i + 1, N), prefix + s.charAt(i));
        }
    }

}
