package com.manh.java.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationTwo
{
    public static Set<String> set = new LinkedHashSet<String>();

    public static void main(String[] args)
    {
        String s = "abc";
        String prefix = "";

        permute(s, prefix);

        System.out.println(set);
        System.out.println(set.size());

    }

    public static void permute(String s, String prefix)
    {
        int N = s.length();
        if (N == 0)
        {
            set.add(prefix);
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
