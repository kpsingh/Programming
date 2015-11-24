package com.manh.java.basics;

public class ReverseStingUsingRecursion
{
    public static void main(String[] args)
    {
        String s = "tarun";
        StringBuilder sb = new StringBuilder();

        System.out.println(reverse(s, sb));

    }

    public static String reverse(String s, StringBuilder sb)
    {

        if (s.length() == 0 || s == null)
        {
            return sb.toString();
        }

        sb.append(s.substring(s.length() - 1));
        reverse(s.substring(0, s.length() - 1), sb);
        return sb.toString();
    }

}
