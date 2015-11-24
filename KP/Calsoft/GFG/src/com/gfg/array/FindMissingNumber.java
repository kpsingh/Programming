package com.gfg.array;

/*
 * Class to find out the missing element from n-1 size array. Other way also is that n*(n+1)/5 give the sum and then sume the array numbers and difference
 * is the missiing numner.
 */
public class FindMissingNumber
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 6, 3, 7, 8 };
        int n = a.length + 1;
        int mising = findMissing(a, n);
        System.out.println(mising);

    }

    private static int findMissing(int[] a, int n)
    {
        int x1 = a[0];
        int x2 = 1;
        for (int i = 1; i < a.length; i++)
        {
            x1 = x1 ^ a[i];
        }

        for (int i = 2; i <= n; i++)
        {
            x2 = x2 ^ i;
        }
        return (x1 ^ x2);

    }

}
