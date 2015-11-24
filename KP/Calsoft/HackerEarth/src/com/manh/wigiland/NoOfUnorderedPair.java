package com.manh.wigiland;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NoOfUnorderedPair
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int N = Integer.parseInt(input);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++)
        {
            int s = sc.nextInt();
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++)
        {
            subsequence("" + list.get(i));
        }

    }

    private static void subsequence(String integer)
    {
        int count = 0;
        
        char[] s = integer.toCharArray();

        ArrayList list = powerset(s);
        
        for(int i = 1; i< list.size(); i++)
        {
           String temp = (String) list.get(i);
           System.out.println(temp);
           /*Integer t = new Integer(temp);
           if(t%6 == 0)
           {
               count++;
           }*/
        }
        System.out.println(count);

    }

    private static ArrayList powerset(char[] set)
    {

        // create the empty power set
        ArrayList<String> power = new ArrayList<String>();

        // get the number of elements in the set
        int elements = set.length;

        // the number of members of a power set is 2^n
        int powerElements = (int) Math.pow(2, elements);

        // run a binary counter for the number of power elements
        for (int i = 0; i < powerElements; i++)
        {

            // convert the binary number to a string containing n digits
            String binary = intToBinary(i, elements);

            // create a new set
            ArrayList<String> innerSet = new ArrayList<String>();

            // convert each digit in the current binary number to the
            // corresponding element
            // in the given set
            for (int j = 0; j < binary.length(); j++)
            {
                if (binary.charAt(j) == '1')
                    innerSet.add("" +set[j]);
            }

            // add the new set to the power set
            power.add("" + innerSet);

        }

        return power;
    }

    private static String intToBinary(int binary, int digits)
    {

        String temp = Integer.toBinaryString(binary);
        int foundDigits = temp.length();
        String returner = temp;
        for (int i = foundDigits; i < digits; i++)
        {
            returner = "0" + returner;
        }

        return returner;
    }
}
