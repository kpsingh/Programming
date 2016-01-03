package com.mmty;

import java.util.ArrayList;

public class MultipleDuplicateValues
{

    public static void main(String[] args)
    {

        int arr[] = { 1, 2, 3, 1, 3, 6, 4 };
        int[] result = getduplicates(arr);
        for (int i = 0; i < result.length; i++)
        {
            System.out.println((result[i]));
        }
    }

    private static int[] getduplicates(int[] arr)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int[] result;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
            {
                l.add(arr[i]);
            }
        }

        result = new int[l.size()];
        int i = 0;
        while (i < l.size())
        {
            result[i] = Math.abs(l.get(i));
            i++;
        }
        return result;
    }
}