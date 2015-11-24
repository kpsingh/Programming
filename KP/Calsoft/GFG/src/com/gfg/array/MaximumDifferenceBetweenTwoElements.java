package com.gfg.array;

public class MaximumDifferenceBetweenTwoElements {
	public static void main(String[] args)
	{
		int a[] = { 80, 2, 6, 11, 100 };

		//System.out.println(findMaxDiff(a));
		System.out.println(findMaxDiffEfficient(a));
	}

	private static int findMaxDiff(int a[])
	{
		int max_diff = 0;
		int curr_diff = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i; j >= 0; j--)
			{
				curr_diff = a[i] - a[j];

				if (curr_diff > max_diff)
				{
					max_diff = curr_diff;
				}
			}
		}
		return max_diff;
	}

	/**
	 * This method wil be more time efficient O(n) . Above will be the O(n2) and
	 * space complexity will be O(1);
	 * 
	 * @param a
	 * @return
	 */
	private static int findMaxDiffEfficient(int a[])
	{
		int max_diff = 0;
		int curr_min = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (a[i] < curr_min)
			{
				curr_min = a[i];
			}

			if (a[i] - curr_min > max_diff)
			{
				max_diff = a[i] - curr_min;
			}
		}
		return max_diff;
	}

}
