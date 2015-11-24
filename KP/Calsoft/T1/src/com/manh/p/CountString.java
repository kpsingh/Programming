package com.manh.p;

import java.util.HashMap;
import java.util.Map;

public class CountString
{
    private static Map<String, Integer> countmap = new HashMap<String, Integer>();

    private static String input[] = { "Good", "Word", "good", "woRd", "anil", "radha" };

    public static void main(String[] args)
    {
        for (String str : input)
        {
            if (countmap.containsKey(str.toLowerCase()))
            {
                countmap.put(str.toLowerCase(), (countmap.get(str.toLowerCase()) + 1));
            }
            else
            {
                countmap.put(str.toLowerCase(), 1);
            }
        }
        System.out.println(countmap);

    }

}
