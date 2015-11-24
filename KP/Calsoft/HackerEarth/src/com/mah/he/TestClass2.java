package com.mah.he;

import java.util.Scanner;

public class TestClass2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 5;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 4;
        arr[8] = 7;
        arr[9] = 6;

        String input = sc.nextLine();
        if (input.length() > 0)
        {
            int length = 0;

            char c[] = input.toCharArray();
            for (int i = 0; i < c.length; i++)
            {
                String s = "" + c[i];
                int num = Integer.parseInt(s);
                length = length + arr[num];
            }
            System.out.println(length);

        }
        else
        {
            System.out.println(0);
        }

    }

}
