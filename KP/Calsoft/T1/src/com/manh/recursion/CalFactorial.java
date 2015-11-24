package com.manh.recursion;

public class CalFactorial
{
    
    public static void main(String args[])
    {
        int n = 5;
        
        int factorial = factorial(n);
        System.out.println(factorial);
    }

    public static int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n*(factorial(n-1));
    }
}
