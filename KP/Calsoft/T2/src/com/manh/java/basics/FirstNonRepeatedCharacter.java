package com.manh.java.basics;

public class FirstNonRepeatedCharacter
{
    public static void main(String[] args)
    {
        String s = "kamlam";
        Character c = findFirstNonRepeatedChar(s);
        System.out.println(c);
    }

    public static Character findFirstNonRepeatedChar(String s)
    {
        char[] arr = s.toCharArray();
        int[] arrint = new int[256];

        for (int i = 0; i < arr.length; i++)
        {
            int j = arr[i];
            (arrint[j])++;
        }

        for (int i = 0; i < arrint.length - 1; i++)
        {
            int max = 1;

            if (arrint[i] > arrint[i + 1])
            {
                char c = (char) i;
                max = i;
                System.out.println(c + " : " + arrint[i]);
                return null;

            }
        }
        return null;

    }

}
