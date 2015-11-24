package com.gayle.lackman.arraystring;

import java.util.HashMap;

public class FindIntersectionOfTwoArray {
	public static void main(String[] args)
	{
		int a[] = { 1, 2, 2, 3 };
		int b[] = { 2, 3, 4 };

		findIntersection(a, b);

	}

	public static void findIntersection(int a[], int b[])
	{

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++)
		{
			if (map.containsKey(a[i]))
			{
				int t = map.get(a[i]) + 1;
				map.put(a[i], t);
			}
			else
			{
				map.put(a[i], 1);
			}
		}

		for (int j = 0; j < b.length; j++)
		{
			int t = map.get(b[j]);
			if (t > 0)
			{
				map.put(b[j], --t);
				System.out.println(b[j]);
			}
		}
	}
}
