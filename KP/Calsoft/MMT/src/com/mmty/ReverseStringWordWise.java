package com.mmty;

public class ReverseStringWordWise
{
    public static void main(String[] args)
    {
        String s = "I am a boy";
        String reverseS = reverse(s);
        System.out.println(reverseS);
    }

    private static String reverse(String s)
    {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = temp.length - 1; i >= 0; i--)
        {
            sb.append(temp[i] + " ");
        }

        return sb.toString();
    }

}
