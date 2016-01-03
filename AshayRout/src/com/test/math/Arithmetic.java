package com.test.math;

/*
 * Given an array containing a sequence of numbers , you need to identify whether that sequence is 
 * Fibonacci , Arithmetic Expression or Geometric Expression.
 */
public class Arithmetic
{
    public static void main(String[] args)
    {
        int a[] = { 1, 5, 9, 13, 16 };
        boolean flag = isArithmetic(a);
        System.out.println(flag);

    }

    private static boolean isArithmetic(int[] a)
    {
        int cd = 0; // Common difference
        int count = 0;

        for (int i = 0; i < a.length - 1; i++)
        {
            if (cd == 0)
            {
                cd = a[i] - a[i + 1];
                count++;
            }
            else
            {
                if (cd == (a[i] - a[i + 1]))
                {
                    count++;
                }
            }
        }

        return count == a.length - 1 ? true : false;
    }
    
    private boolean isGeometic(int[] a)
    {
        int cr = 0; // comman ratio
        int count = 0;
        
        return false;
    }
}