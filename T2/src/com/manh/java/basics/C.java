package com.manh.java.basics;

import java.util.HashMap;

public class C
{
    public static void main(String[] args)
    {
        String s = "Manhattan Associates India Ltd manhattan india";
        s = s.toLowerCase();
        // count the number of each string.

        String[] sb = s.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s1 : sb)
        {
            if (map.keySet().contains(s1))
            {
                map.put(s1, ((map.get(s1)) + 1));

            }
            else
            {
                map.put(s1, 1);

            }
        }
        System.out.println(map);

    }
}
