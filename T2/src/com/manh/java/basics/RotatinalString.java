package com.manh.java.basics;

public class RotatinalString
{
    public static void main(String[] args)
    {
        String s1 = "ABCD";
        String s2 = "CDAB";

        boolean check = isRotatational(s1, s2);
    }

    public static boolean isRotatational(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }

        char[] arrs1 = s1.toCharArray();
        char[] arrs2 = s2.toCharArray();

        char temp = arrs1[0];
        int countOnarrs2 = 0;

        for (int i = 0; i < arrs2.length; i++)
        {
            if (temp == arrs2[i])
            {
                countOnarrs2 = i;
            }
        }
       
        String mix = s1.concat(s2);
        String subString = mix.substring(countOnarrs2 - 1, (countOnarrs2 - 1+ s2.length()));
        System.out.println(subString);
        
        

        return false;
    }

}
