package com.manh.java.basics;

public class AllPermutationWithRepetation
{
    public static void main(String[] args)
    {
        String s = "abc";
        // permuteWithRepetation("", s);
       // System.out.println(count);
        permute("", s);

    }

    static int count;

    public static void permuteWithRepetation(String prefix, String s)
    {

        if (prefix.length() == s.length())
        {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < s.length(); i++)
        {
            permuteWithRepetation(prefix + s.charAt(i), s);
        }
    }

    public static void permute(String prefix, String s)
    {
        
        if (s.length() == 0)
        {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < s.length(); i++)
        {
            permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, s.length()));
        }

    }

}
