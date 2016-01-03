package com.test.math;

public class PowerOfNumber {

	static int x = 2;
	static int y = 7;

	public static void main(String[] args)
	{
		System.out.println(getPowerRec(x, y));

	}

	private static int getPower(int b, int e)
	{
		int result = 1;
		for (int i = 0; i < e; i++)
		{
			result = result * b;
		}
		return result;

	}

	private static int getPowerRec(int b, int e)
	{
		if (e == 1)
		{
			return b;
		}

		if (e % 2 != 0)
		{
			b = b * b * x;
		}
		else
		{
			b = b * b;
		}
		e = e / 2;
		
		return getPowerRec(b, e);
	}

}
