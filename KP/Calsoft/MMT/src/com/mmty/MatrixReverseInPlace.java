package com.mmty;

public class MatrixReverseInPlace
{
    public static void main(String[] args)
    {
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9}};

        int n = A.length -1;
        System.out.println("before ");
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++)
                System.out.print("\t"+A[i][j]);
            System.out.println();
        }
        

        for (int i = 0; i <= (n - 1) / 2; i++)
        {
            for (int j = i; j < n - i - 1; j++)
            {
                int p1 = A[i][j];
                int p2 = A[j][n - i - 1];
                int p3 = A[n - i - 1][n - j - 1];
                int p4 = A[n - j - 1][i];

                A[j][n - i - 1] = p1;
                A[n - i - 1][n - j - 1] = p2;
                A[n - j - 1][i] = p3;
                A[i][j] = p4;
            }

        }
        
        System.out.println("after ");
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++)
                System.out.print("\t"+A[i][j]);
            System.out.println();
        }

    }
}
