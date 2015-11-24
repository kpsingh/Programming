package com.manh.important.program;

import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationAndPalindrom
{
    public static Set<String> set = new LinkedHashSet<String>();

    public static void main(String[] args)
    {
        String s = "aba";
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
    
    // Recusrsive way to check Palindrom
    
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
