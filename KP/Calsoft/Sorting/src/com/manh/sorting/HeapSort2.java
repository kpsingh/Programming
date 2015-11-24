package com.manh.sorting;

public class HeapSort2
{
    static int N;

    public static void main(String[] args)
    {
        int arr[] = { 5, 9, 6, 2, 34, 3, 10, 4 };
        sort(arr);

    }

    public static void sort(int[] arr)
    {
        heapify(arr);

        for (int i = N; i > 0; i--)
        {
            swap(arr, 0, i);
            N = N - 1;
            maxheap(arr, 0);
        }

    }

    private static void maxheap(int[] arr, int i)
    {

    }

    private static void swap(int[] arr, int i, int i2)
    {

    }

    private static void heapify(int[] arr)
    {

    }

}
