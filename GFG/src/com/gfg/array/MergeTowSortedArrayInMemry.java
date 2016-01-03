package com.gfg.array;

public class MergeTowSortedArrayInMemry {

	public static void main(String[] args)
	{
		int a[] = { 2, 3, 5, 7, 0, 0, 0 };

		int b[] = { 1, 4, 6 };
		System.out.println("Before merge");
		for (int i : a)
		{
			System.out.println(i);
		}

		a = merge(a, 4, b, b.length);
		System.out.println("After merge");
		for (int i : a)
		{
			System.out.println(i);
		}

	}

	/**
	 * Here a and b are the two arrays. M is the length of filed element of
	 * array a and n is the length of filled element in b (for array b, filed
	 * element length will be equals to array length itself).
	 * 
	 * @param a
	 *            bigger array
	 * @param m
	 *            length/size of total element in bigger array
	 * @param b
	 *            smaller array
	 * @param n
	 *            size of the smaller array
	 * @return 
	 * 			  merged array
	 */

	public static int[] merge(int a[], int m, int b[], int n)
	{
		while (m > 0 && n > 0)
		{
			if (a[m - 1] > b[n - 1])
			{
				a[m + n - 1] = a[m - 1];
				m--;
			}
			else
			{
				a[m + n - 1] = b[n - 1];
				n--;
			}
		}

		while (n > 0)
		{
			a[m + n - 1] = b[n - 1];
			n--;
		}

		return a;

	}

}
