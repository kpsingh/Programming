package com.gfg.array;

public class BitWiseTest
{
    public static void main(String[] args)
    {
        System.out.println(5 << 2);
        int i = add(2,3);
        System.out.println(i);
        
    }

    private static int add(int x, int y)
    {
        int carry = 0;
        int result = 0;
        int i;

        for(i = 0; i < 32; ++i) {
            int a = (x >> i) & 1;
            int b = (y >> i) & 1;
            result |= ((a ^ b) ^ carry) << i;
            carry = (a & b) | (b & carry) | (carry & a);
        }

        return result;
        }

}
