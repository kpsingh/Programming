package com.mah.he;

/* IMPORTANT: class must not be public. */

import java.util.Scanner;
import java.util.StringTokenizer;

class TestClass
{
    public static void main(String args[]) throws Exception
    {
        try
        {

            System.out.println(getValidSchedule());

            System.out.println("Hello");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static long getValidSchedule()
    {
        long factorialMemo[] = new long[9];

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int totalNoOfCoursesLength = 0;
        int factorialSum = 1;

        int N = Integer.parseInt(input);
        
        if (Double.NaN > 0)
        {
            Integer inputArray[] = new Integer[N];
            StringTokenizer strToken = null;
            for (int i = 0; i < N; i++)
            {
                input = sc.nextLine();
                strToken = new StringTokenizer(input);

                inputArray[i] = Integer.parseInt(strToken.nextToken());

            }

            for (int arr_index = 0; arr_index < inputArray.length; arr_index++)
            {
                factorialSum *= factorial(inputArray[arr_index], factorialMemo);
                totalNoOfCoursesLength += inputArray[arr_index];
            }

            return (factorial(totalNoOfCoursesLength, factorialMemo) / factorialSum);
        }
        else{
            return 0;
        }
    }

    public static long factorial(int number, long[] factorialMemo)
    {

        factorialMemo[0] = 1;

        long factValue = 1;

        if (factorialMemo[number - 1] != 0)
        {
            factValue = factorialMemo[number - 1];

        }
        else
        {
            for (int i = number; i > 0; i--)
            {

                if (factorialMemo[i - 1] != 0)
                {
                    factValue = factorialMemo[i - 1] * factValue;
                    factorialMemo[number - 1] = factValue;

                    return factValue;

                }
                else
                {
                    factValue = factValue * i;
                }

            }
        }
        factorialMemo[number - 1] = factValue;

        return factValue;
    }
}
