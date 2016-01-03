package com.manh.java.basics;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        String dest = "test string";
        String source = "mask";

        dest = removeDuplicates(dest, source);
    }

    public static String removeDuplicates(String dest, String source)
    {
        char[] d = dest.toCharArray();
        char[] s = source.toCharArray();

        Character[] result = new Character[source.length()];

        for (int i = 0; i < d.length; i++)
        {
            result[i] = d[i];
        }
        
        for(int i = 0; i< s.length; i++)
        {
            
        }
        return "ab";

    }

}
