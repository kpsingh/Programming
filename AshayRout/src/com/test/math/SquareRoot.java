package com.test.math;

/*
 * This class demostrate Babylonian method of square root calculation.
 */
public class SquareRoot
{
    public static void main(String[] args)
    {
        int n = 48;
        System.out.println("Square root of " + n + " is " + squareRoot(n));
    }

    public static float squareRoot(float n)
    {
        /*
         * We are using n itself as initial approximation This can definitely be
         * improved
         */
        float x = n;
        float y = 1;
        float e = (float) 0.0000001; /* e decides the accuracy level */
        while (x - y > e)
        {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }

}