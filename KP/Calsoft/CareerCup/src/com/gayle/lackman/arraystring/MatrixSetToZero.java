package com.gayle.lackman.arraystring;

public class MatrixSetToZero
{
    public static void main(String[] args)
    {
        int a[][] = { { 3, 4, 0, 6 }, { 9, 0, 4, 2 }, { 5, 7, 3, 1 } };// 3*4
        // matrix.
        System.out.println("Before");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();

        }

        
        setZeros(a);

        System.out.println("After");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }

    }

    private static void setZeros(int[][] a)
    {
        boolean[] row = new boolean[a.length];
        boolean[] col = new boolean[a[0].length];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                if (a[i][j] == 0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++)
        {
            if (row[i])
            {
                nullyfyRow(a, i);
            }
        }

        for (int i = 0; i < a[0].length; i++)
        {
            if (col[i])
            {
                nullyfyCol(a, i);
            }
        }

    }

    private static void nullyfyCol(int[][] a, int col)
    {
        for (int j = 0; j < a.length; j++)
        {
            a[j][col] = 0;
        }

    }

    private static void nullyfyRow(int[][] a, int row)
    {
        for (int j = 0; j < a[0].length; j++)
        {
            a[row][j] = 0;
        }

    }

}
