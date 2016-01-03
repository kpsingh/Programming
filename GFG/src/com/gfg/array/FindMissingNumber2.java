package com.gfg.array;

/*
 * find the missing number by XOR operation
 */
public class FindMissingNumber2
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 5, 6, 3, 7, 8 };
        int x = 1;

        for (int i = 2; i <= a.length + 1; i++)
        {
            x = x ^ i;
        }

        for (int t : a)
        {
            x = x ^ t;
        }

        System.out.println(x);
    }

}
