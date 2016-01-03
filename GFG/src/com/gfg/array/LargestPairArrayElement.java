package com.gfg.array;

public class LargestPairArrayElement
{
    public static void main(String[] args)
    {
        int a[] = { 70, 34, 10, 60, 85, 36, 55, 105, 33, 90, 120 };

        int max = a[0];
        int secmax = a[1];

        for (int i = 2; i < a.length; i++)
        {
            if (a[i] > max && a[i] > secmax)
            {
                if (max > secmax)
                {
                    secmax = max;
                }
                max = a[i];
            }
            else if (a[i] > secmax)
            {
                secmax = a[i];
            }

        }

        System.out.println("Max: " + max + ", secMax : " + secmax + " and sum = " + (max + secmax));

    }
}
