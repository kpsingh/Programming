package com.manh.kmp;

public class AllPermutationWithRepetation
{
    public static void main(String[] args)
    {
        String s = "abc";
        // permuteWithRepetation("", s);
        System.out.println();
        permuteWithRepetation("", s);

    }

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
        int N = s.length();
        if (N == 0)
        {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < N; i++)
        {
            permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
        }

    }

}
