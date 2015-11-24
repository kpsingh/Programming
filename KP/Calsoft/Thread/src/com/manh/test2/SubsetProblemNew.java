package com.manh.test2;

import java.util.Scanner;

public class SubsetProblemNew
{

    public static void main(String arg[])
    {

        Scanner sc = new Scanner(System.in);
        int noOfOutputLength = sc.nextInt();
        for (int i = 0; i < noOfOutputLength; i++)
        {

            System.out.println(getCount(3, sc.nextInt()));
        }

    }

    private static long getCount(int stringCharcterSize, int noOfOutputLength)
    {

        long inp1 = getPower3(3, noOfOutputLength - 1);
        long inp2 = getPower3(2, noOfOutputLength);

        return 3 * (inp1 - inp2 + 1);

    }

    private static long getPower3(int number, int size)
    {

        int modulo = ((int) Math.pow(10, 9) + 7);
        long result = 1;
        for (int i = 0; i < size; i++)
        {
            result = (result % modulo * number % modulo);

        }
        return result;
    }

}
