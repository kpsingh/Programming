package com.manh.kmp;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubStringWORepeating
{
    public static void main(String[] args)
    {
        String s = "geeksforgeek";
        int count = findLongestSubString(s.toCharArray());
        System.out.println(count);
        System.out.println(longestUniqueSubsttr(s));
    }

    private static int findLongestSubString(char[] c)
    {
        int count = 0;
        int begin_index = 0;
        int max_count = 0;

        ArrayList list = new ArrayList();

        for (int i = 0; i < c.length; i++)
        {
            if (list.contains(c[i]))
            {
                if (count > max_count)
                {
                    max_count = count;
                }
                count = 1;
                list.add(c[i]);
            }
            else
            {
                count++;
                list.add(c[i]);
            }
        }
        return max_count > count ? max_count : count;

    }

    static int longestUniqueSubsttr(String str)
    {
        int i, j, n = str.length(), max, len = 0;
        HashMap mp = new HashMap();
        max = 0;
        for (i = 0; i < n; i++)
        {
            mp.put(str.charAt(0), 1);
            len = 1;
            for (j = i + 1; j < n; j++)
            {
                if (mp.get(str.charAt(j)) == null)
                {
                    mp.put(str.charAt(j), 1);
                    len++;
                }
                else
                    break;
            }
            if (len > max)
                max = len;
        }
        return max;
    }

}