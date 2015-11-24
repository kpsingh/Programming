package com.mmty;

public class MergeTwoArrayInSorted
{
    public static void main(String[] args)
    {
        int a[] = { 2, 6, 7, 8 };
        int b[] = { 1, 5, 9 ,11};
        int result[] = mergeAndSort(a, b);
        for(int i : result)
        {
            System.out.print(i + ",");
        }

    }

    private static int[] mergeAndSort(int[] a, int[] b)
    {
        int[] result = new int[(a.length + b.length)];

        int i = 0, j = 0, k = 0;
        while (i < a.length & j < b.length)
        {
            if (a[i] < b[j])
            {
                result[k++] = a[i++];
            }
            else
            {
                result[k++] = b[j++];
            }
        }

        while (i < a.length)
        {
            result[k++] = a[i++];
        }
        while (j < b.length)
        {
            result[k++] = b[j++];
        }

        return result;
    }
}
