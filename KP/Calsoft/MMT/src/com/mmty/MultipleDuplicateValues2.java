package com.mmty;

import java.util.ArrayList;

public class MultipleDuplicateValues2
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 3, 4, 3, 6, 4 };

        int result[] = getDuplicate(a);
        System.out.println("Duplicate Elements : ");
        for (int temp : result)
        {
            System.out.print(temp + " ");
        }
    }

    private static int[] getDuplicate(int[] a)
    {
        int result[];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++)
        {
            if (a[Math.abs(a[i])] >= 0)
            {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            }
            else
            {
                list.add(Math.abs(a[i]));
            }
        }

        result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        return result;
    }

}
