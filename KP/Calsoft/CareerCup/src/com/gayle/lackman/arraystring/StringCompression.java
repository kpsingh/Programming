package com.gayle.lackman.arraystring;

public class StringCompression
{
    public static void main(String[] args)
    {
        String s = "aabcccccaaa";
        compressString(s);
    }

    private static void compressString(String s)
    {
        char[] temp = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = -1;
        char c = ' ';

        for (char t : temp)
        {
            if (c == t)
            {
                count++;
            }
            else
            {
                if (count == -1)
                {
                    sb.append(t);
                    count = 0;
                    c = t;
                }
                else
                {
                    sb.append(++count);
                    c = t;
                    sb.append(t);
                    count = 0;
                }
            }

        }
        sb.append(++count);

        System.out.println(sb.toString());

    }
}