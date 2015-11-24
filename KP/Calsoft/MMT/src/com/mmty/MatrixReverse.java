package com.mmty;

import java.util.Arrays;

public class MatrixReverse
{
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = new int[3][3];
        int length = a.length - 1;
        int n = a.length;
        System.out.println("before ");
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++)
                System.out.print("\t"+a[i][j]);
            System.out.println();
        }
/*
 * 90 digree reverse nothing but transpose we have to do. Wenever row become column and column becomes rows.
 */
        for (int i = length; i >= 0; i--)
        {
            for (int j = 0; j <= length; j++)
            {
                b[j][length - i] = a[i][j];
            }
        }

        System.out.println("after ");
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++)
                System.out.print("\t"+b[i][j]);
            System.out.println();
        }

    }

}
