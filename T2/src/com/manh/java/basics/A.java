package com.manh.java.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class A
{
    public static void main(String[] args)
    {
        String s = "Akram Tigala";
        char[] arr = s.toCharArray();
        Set<Character> charset = new LinkedHashSet<Character>();

        for (Character c : arr)
        {
            charset.add(c.toLowerCase(c));
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : charset)
        {
            sb.append(c);
        }

        System.out.println(sb.toString());

    }

}