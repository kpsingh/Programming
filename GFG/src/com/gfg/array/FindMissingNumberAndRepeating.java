package com.gfg.array;

public class FindMissingNumberAndRepeating
{
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int sum = 0;
        for(int i : a)
        {
            sum += i;
        }
        System.out.println(sum);
        
        int b[] = new int[a.length];
        for(int i = 1; i<= a.length; i++)
        {
            b[i] = i;
        }
        
        
    }

}
