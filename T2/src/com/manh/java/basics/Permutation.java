package com.manh.java.basics;

public class Permutation
{
    public static void main(String[] args)
    {
        String s = "abc";
        String prefix = "";
        permute(s, prefix);

    }

    public static void permute(String s, String prefix)
    {
        int N = s.length();
        if (N == 0)
        {
            System.out.println(prefix);
        }
        else
        {
            for (int i = 0; i < N; i++)
            {
                permute(s.substring(0, i) + s.substring(i + 1, N), prefix + s.charAt(i));
            }
        }
    }

}
