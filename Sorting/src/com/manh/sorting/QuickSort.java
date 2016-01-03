package com.manh.sorting;

public class QuickSort
{
    public static void main(String[] args)
    {
        int arr[] = { 15, 2, 1, 9, 7, 4 };
        quickSort(arr, 0, (arr.length - 1));

        for (int i : arr)
        {
            System.out.println(i);
        }

    }

    public static void quickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);

        }

    }

    public static int partition(int[] arr, int start, int end)
    {
        int pIndex = start;
        int pivot = arr[end];

        for (int i = start; i < end; i++)
        {
            if (arr[i] <= pivot)
            {
                swap(arr, i, pIndex);

                pIndex = pIndex + 1;
            }
        }

        swap(arr, pIndex, end);

        return pIndex;
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
