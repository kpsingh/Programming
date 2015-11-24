package com.manh.java.basics;

import java.util.ArrayList;

public class D
{
    public static void main(String[] args)
    {
        String s = "Lets make in India. India is a great country";
        // When any letter getting encountered more than one time make, it in
        // caps
           s = s.toLowerCase();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        ArrayList list = new ArrayList();

        for (Character c : arr)
        {
            if (list.contains(c.hashCode()))
            {
                sb.append(c.toUpperCase(c));
            }
            else
            {
                sb.append(c);
                list.add(c.hashCode());
            }

        }

        System.out.println(sb);

    }

}
