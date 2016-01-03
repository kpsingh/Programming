package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t; // Number of test cases.
        int noc; // Number of cycles.
        int height = 1; // Initial height of the tree.

        t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {

            noc = sc.nextInt();
            if (noc == 1)
            {
                height = height * 2;
            }

            else if (noc > 1)
            {
                for (int j = 1; j <= noc; j++)

                {
                    if (j % 2 != 0)
                    {
                        height = height * 2;
                    }
                    else
                    {
                        height = height + 1;
                    }
                }
            }
            System.out.println(height);
            height = 1;
        }
    }
}
