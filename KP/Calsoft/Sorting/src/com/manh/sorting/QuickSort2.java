package com.manh.sorting;

public class QuickSort2
{
    public static void main(String[] args)
    {
        int arr[] = { 15,182, 1, 9, 71,2,8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.println(i);
        }

    }

    private static void quickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);

        }
    }

    private static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int pIndex = start;

        for (int i = start; i < end; i++)
        {
            if (arr[i] < pivot)
            {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;

    }

    private static void swap(int[] arr, int i, int pIndex)
    {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;

    }

}
