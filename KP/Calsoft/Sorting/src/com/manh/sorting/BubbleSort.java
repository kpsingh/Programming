package com.manh.sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        for (int i : arr)
        {
            System.out.print(i + ",");

        }
        bubbleSort(arr, n);
        System.out.println();
        for (int i : arr)
        {
            System.out.print(i + ",");
        }
    }

    public static void bubbleSort(int arr[], int n)
    {
        int i, j;

        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    swap(arr, j);
                }
            }
        }

    }

    public static void swap(int arr[], int j)
    {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

}
