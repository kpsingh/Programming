package com.gfg.misc;

public class FabonacciByRecusion {

	static int a[] = new int[51];

	public static void main(String[] args)
	{
		int num = 40;
		for (int i = 1; i <= num; i++)
		{
			System.out.println(findFibonacci(i));

		}
	}

	public static int findFibonacci(int n)
	{
		if (n <= 1)
		{
			return n;
		}

		if (a[n] == 0)
		{
			a[n] = findFibonacci(n - 1) + findFibonacci(n - 2);
		}

		return a[n];
	}

}
