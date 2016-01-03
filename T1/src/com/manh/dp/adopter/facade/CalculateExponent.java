package com.manh.dp.adopter.facade;

public class CalculateExponent
{
    public static double calculateExponent(int b, int e)
    {
        if (e == 0)

        {
            return 1;
        }
        if (e > 0)
        {
            return b * (calculateExponent(b, (e - 1)));

        }

        return 1 / (b * (calculateExponent(b, (-e - 1))));

    }

    public static void main(String[] args)
    {
        int b = 2;
        int e = -1;
        double result = calculateExponent(b, e);
        System.out.println("Result : " + result);

    }

}