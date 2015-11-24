package com.gfg.array;

public class MaxSubArraySum {

	public static void main(String[] args)
	{
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int b[] = { -2, -1, -5, -6 };

		//System.out.println(findMaxSubArraySum(a));
		System.out.println(findMaxSubArraySumNegative(a));
	}

	/**
	 * This method will not handle if the array contains all negative numbers.
	 * 
	 * @param a
	 *            array of integers.
	 * @return
	 */
	private static int findMaxSubArraySum(int a[])
	{
		int max_so_far = 0;
		int curr_max = 0;
		/*int start = 0;
		int end = 0;*/

		for (int i = 0; i < a.length; i++)
		{
			curr_max = curr_max + a[i];

			if (curr_max < 0)
			{
				//start= i +1;
				curr_max = 0;
			}
			/*
			 * Do not compare for all elements. Compare only when curr_max > 0
			 */
			else if (curr_max > max_so_far)
			{
				//end =  i;
				max_so_far = curr_max;
			}
		}
		//System.out.println("Start : " + start +", End : " + end);
		return max_so_far;
	}

	/**
	 * Handle all negative element as well;
	 * 
	 * @param a
	 * @return
	 */
	private static int findMaxSubArraySumNegative(int a[])
	{
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < a.length; i++)
		{
			curr_max = max(a[i], curr_max + a[i]);
			max_so_far = max(max_so_far, curr_max);
		}

		return max_so_far;

	}

	private static int max(int a, int b)
	{
		return a > b ? a : b;
	}
}
