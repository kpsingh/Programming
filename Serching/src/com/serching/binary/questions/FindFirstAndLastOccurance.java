package com.serching.binary.questions;

public class FindFirstAndLastOccurance
{
    public static void main(String[] args)
    {
        int a[] = { 1, 4, 7, 7, 7, 7, 7, 8, 25, 34 };
        int fistOccurance = findFirstOccurance(a, 7);
        int lastOccurance = findLastOccurance(a, 7);
        System.out.println("First Occurance : " + fistOccurance);
        System.out.println("Last Occurance : " + lastOccurance);

        System.out.println("No of count for searched elemet: "
                + (lastOccurance - fistOccurance + 1));
    }

    private static int findLastOccurance(int[] a, int x)
    {
        if (a.length != 0)
        {
            int low = 0;
            int high = a.length - 1;
            int result = -1;

            while (low <= high)
            {
                int mid = (low + high) / 2;

                if (x == a[mid])
                {
                    result = mid;
                    low = mid + 1;
                }
                else if (x > a[mid])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            return result;

        }
        return -1;
    }

    private static int findFirstOccurance(int[] a, int x)
    {
        if (a.length < 0)
        {
            return -1;
        }
        else
        {
            int low = 0;
            int high = a.length - 1;
            int result = -1;

            while (low <= high)
            {
                int mid = (low + high) / 2;

                if (x == a[mid])
                {
                    result = mid;
                    high = mid - 1;
                }
                else if (x < a[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            return result;
        }
    }

}
