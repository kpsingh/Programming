package com.manh.sorting;

public class MergeSort
{
    public static void main(String[] args)
    {
        int a[] = { 1, 5, 7, 15, 4, 3, 8, 6, 9, 0, 17, 11 };
        mergeSort(a);
        for (int t : a)
        {
            System.out.print(" " +t);
        }
    }

    /*
     * This method will divide the array into two sub array until the minimum
     * array left with one size and then call the merge on sub arrays.
     */
    private static void mergeSort(int[] a)
    {
        if (a.length > 1)
        {
            int n = a.length / 2;

            int a1[] = new int[n];
            int a2[] = new int[a.length - n];

            for (int i = 0; i < a.length; i++)
            {
                if (i < n)
                {
                    a1[i] = a[i];
                }
                else
                {
                    a2[i - n] = a[i];
                }
            }
            mergeSort(a1);
            mergeSort(a2);
            merge(a, a1, a2);

        }

    }

    /*
     * This method will take the three array - initial array and two sub array
     * and then compares the elements from both sub array and put into the
     * initial array.
     */
    private static void merge(int[] a, int[] a1, int[] a2)
    {
        int i = 0, j = 0, k = 0;
        while (j < a1.length && k < a2.length)
        {
            if (a1[j] <= a2[k])
            {
                a[i] = a1[j];
                j++;
                i++;
            }
            else
            {
                a[i] = a2[k];
                k++;
                i++;
            }
        }
        while (j < a1.length)
        {
            a[i] = a1[j];
            j++;
            i++;
        }
        while (k < a2.length)
        {
            a[i] = a2[k];
            k++;
            i++;
        }

    }

}
