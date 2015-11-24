package com.manh.permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationCalculation
{

    public static void main(String[] args)
    {
     
        
        String s = "abc";
       // String s1 = "EBAY";
       // String s2 = "Yahoo";
        System.out.println("String " + s + ":\nPermutations: " + crunchifyPermutation(s));
       // System.out.println("\nString " + s1 + ":\nPermutations: " + crunchifyPermutation(s1));
       // System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));
    }

    public static Set<String> crunchifyPermutation(String str)
    {
        Set<String> crunchifyResult = new HashSet<String>();
        if (str == null)
        {
            return null;
        }
        else if (str.length() == 0)
        {
            crunchifyResult.add("");
            return crunchifyResult;
        }

        char firstChar = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = crunchifyPermutation(rem);
        for (String newString : words)
        {
            for (int i = 0; i <= newString.length(); i++)
            {
                crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
            }
        }
        return crunchifyResult;
    }

    public static String crunchifyCharAdd(String newString, char firstChar, int i)
    {
        String first = newString.substring(0, i);
        String last = newString.substring(i);
        return first + firstChar + last;
    }

}