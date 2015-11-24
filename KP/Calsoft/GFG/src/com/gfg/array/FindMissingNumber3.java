package com.gfg.array;

public class FindMissingNumber3
{
    public static void main(String[] args)
    {
        int a[] = { 1, 4, 5, 6, 2 };
        int missing = findMissing(a);
        System.out.println(missing);
    }

    private static int findMissing(int[] a)
    {
        int xor1 = a[0];
        for (int i = 1; i < a.length; i++)
        {
            xor1 = xor1 ^ a[i];
        }

        int xor2 = 1;

        for (int i = 2; i <= a.length + 1; i++)
        {
            xor2 = xor2 ^ i;
        }

        return (xor1 ^ xor2);
    }

}
