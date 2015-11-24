package com.urban.ladder;

/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass
{
    public static void main(String args[]) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String line = br.readLine();
            if (line.length() > 1)
            {
                String a[] = line.split(" ");
                Integer noOfNodes = Integer.parseInt((a[0]));
                Integer noOfEdgesfound = Integer.parseInt((a[1]));
                for (int i = 0; i < noOfEdgesfound; i++)
                {
                    String temp = br.readLine();
                }

                int totalNoOfEdges = ((noOfNodes - 1) * (noOfNodes - 2)) / 2;

                System.out.println(totalNoOfEdges);

            }

        }
        catch (Exception e)
        {

        }
    }
}
