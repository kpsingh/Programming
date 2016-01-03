package com.test.math;

public class CoinChange
{
    public static void main(String[] args)
    {
        CoinChange cc = new CoinChange();
        int total = 15;
        int coins[] = { 1, 3, 4, 6, 7, 9 };
        System.out.println(cc.minCoin(total, coins));
    }

    /**
     * Recursive solution
     */
    public int minCoin(int total, int coins[])
    {
        return minCoin(total, coins, 0);
    }

    private int minCoin(int total, int coins[], int count)
    {
        if (total == 0)
        {
            return count;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++)
        {
            if (coins[i] <= total)
            {
                int sum = minCoin(total - coins[i], coins, count + 1);
                if (min > sum)
                {
                    min = sum;
                }
            }
        }
        return min;
    }
}
