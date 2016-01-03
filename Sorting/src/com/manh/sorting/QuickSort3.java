package com.manh.sorting;

public class QuickSort3
{
    public static void main(String[] args)
    {
        int a[] = { 1, 5, 7, 15, 4, 3, 8, 6, 9, 0, 17, 11 };
        quickSort(a, 0, a.length - 1);
        for (int t : a)
        {
            System.out.println(t);
        }
    }

    private static void quickSort(int[] a, int start, int end)
    {
        if (start < end)
        {
            int pIndex = getPartisionIndex(a, start, end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    private static int getPartisionIndex(int[] a, int start, int end)
    {
        int pivot = a[end];
        int pIndex = start;

        for (int i = start; i <= end; i++)
        {
            if (a[i] < pivot)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, end, pIndex);
        return pIndex;

    }

    private static void swap(int[] a, int i, int pIndex)
    {
        int temp = a[i];
        a[i] = a[pIndex];
        a[pIndex] = temp;
    }

}
