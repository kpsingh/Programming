package com.mmty;

public class FindRepeatingAndMissing
{
    public static void main(String args[])
    {

        int arr[] = new int[] { 4, 2, 1, 6, 4, 6 };
        int size = 6;

        for (int i = 0; i < size; i++)
            if (arr[i] != i + 1)
            {
                int tmp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = tmp;
            }

        for (int i = 0; i < size; i++)
            if (arr[i] != i + 1)
            {
                int tmp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = tmp;
            }

        for (int i = 0; i < size; i++)
            if (arr[i] != i + 1)
            {
                System.out.println("The repeating no is : " + arr[i]);
                System.out.println("The missing no is : " + (i + 1));
            }
    }

}
