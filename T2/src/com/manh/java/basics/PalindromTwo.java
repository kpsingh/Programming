package com.manh.java.basics;

public class PalindromTwo
{
    public static void main(String[] args)
    {
        String s = "kpspk";
        char[] arr = s.toCharArray();
        boolean p = isPalindrome(arr);
        System.out.println("Is string is palindome : " + p);

    }

    public static boolean isPalindrome(char[] arr)
    {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--)
        {
            if (arr[i] != arr[j])
            {
                return false;
            }
        }
        return true;
    }

}
