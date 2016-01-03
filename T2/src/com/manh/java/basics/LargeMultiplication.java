package com.manh.java.basics;

public class LargeMultiplication
{
    public static void main(String[] args)
    {
        int[] Num1 = { 1,2 };
        int[] Num2 = { 5 };
        int sum = 0, carry;
        int k = Num1.length + Num2.length;
        int[] Num = new int[k];
        for (int i = Num1.length - 1; i >= 0; i--)
        {
            carry = 0;
            for (int j = Num2.length - 1; j >= 0; j--)
            {
                sum = Num2[j] * Num1[i] + carry + Num[k - 1];
                carry = sum / 10;
                Num[--k] = sum % 10;

            }
            Num[--k] = carry;
            k += Num2.length;
        }

        for (int j = 0; j < Num.length; j++)
        {
            System.out.println(j + "= " + Num[j]);
        }
    }
}