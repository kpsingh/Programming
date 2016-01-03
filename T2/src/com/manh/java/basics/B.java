package com.manh.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class B
{
    public static void main(String[] args)
    {
        String s = "Akram Tigala";
        s = s.toLowerCase();
        System.out.println(s);
        char[] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        for (Character c : arr)
        {
            if (!(list.contains(c.hashCode())))
            {
                list.add(c.hashCode());
                sb.append(c);
            }

        }

        System.out.println(sb.toString());
        System.out.println(list.toString());

    }

}